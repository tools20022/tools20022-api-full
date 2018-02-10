/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.PostTradeMatchingISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent from Central Matching Utility (CMU) to an executing
 * party or an instructing party to advise the status of the
 * SecuritiesTradeConfirmation message previously sent by the party. The status
 * may be a processing, pending processing, affirmed or disaffirmed, cancel or
 * replacement by an instructing party, a custodian or an affirming party,
 * internal matching, and/or matching status.<br>
 * The instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager or of other
 * categories of investors. The executing party is typically the broker/dealer
 * or an intermediary system/vendor communicating on behalf of the
 * broker/dealer.<br>
 * The ISO 20022 Business Application Header must be used<br>
 * <b>Usage</b><br>
 * Initiator: In central matching the Initiator is the Central Matching Utility.<br>
 * Respondent: no response is needed by the recipient of the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmIdentification
 * SecuritiesTradeConfirmationStatusAdviceV02.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmReferences
 * SecuritiesTradeConfirmationStatusAdviceV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmAffirmationStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmMatchingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmReplacementProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmCancellationProcessingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmPartyTradingDetails
 * SecuritiesTradeConfirmationStatusAdviceV02.mmPartyTradingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmCounterpartyTradingDetails
 * SecuritiesTradeConfirmationStatusAdviceV02.mmCounterpartyTradingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmConfirmationParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmSupplementaryData
 * SecuritiesTradeConfirmationStatusAdviceV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeMatchingISOLatestversion
 * PostTradeMatchingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesTradConfStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.044.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusPresenceRule#forSecuritiesTradeConfirmationStatusAdviceV02
 * ConstraintStatusPresenceRule.forSecuritiesTradeConfirmationStatusAdviceV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeConfirmationStatusAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent from Central Matching Utility (CMU) to an executing party or an instructing party to advise the status of the SecuritiesTradeConfirmation message previously sent by the party. The status may be a processing, pending processing, affirmed or disaffirmed, cancel or replacement by an instructing party, a custodian or an affirming party, internal matching, and/or matching status.\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors. The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: In central matching the Initiator is the Central Matching Utility.\r\nRespondent: no response is needed by the recipient of the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01
 * SecuritiesTradeConfirmationStatusAdviceV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeConfirmationStatusAdviceV02", propOrder = {"identification", "references", "affirmationStatus", "processingStatus", "matchingStatus", "replacementProcessingStatus", "cancellationProcessingStatus",
		"partyTradingDetails", "counterpartyTradingDetails", "confirmationParties", "deliveringSettlementParties", "receivingSettlementParties", "supplementaryData"})
public class SecuritiesTradeConfirmationStatusAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected TransactiontIdentification4 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactiontIdentification4
	 * TransactiontIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an SecuritiesTradeConfirmationStatusAdvice message as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmIdentification
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an SecuritiesTradeConfirmationStatusAdvice message as known by the account owner (or the instructing party acting on its behalf).";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactiontIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Refs", required = true)
	protected List<Linkages18> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages18
	 * Linkages18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmReferences
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmReferences;
			minOccurs = 1;
			complexType_lazy = () -> Linkages18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AffirmSts")
	protected AffirmationStatus6Choice affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
	 * AffirmationStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the affitrmation status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmAffirmationStatus
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmAffirmationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAffirmationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Provides details on the affitrmation status of a trade.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmAffirmationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AffirmationStatus6Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getAffirmationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus17Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus17Choice
	 * ProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the processing status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmProcessingStatus
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the processing status of a trade.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus17Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus23Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the matching status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmMatchingStatus
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides details on the matching status of a trade.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus23Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RplcmntPrcgSts")
	protected ReplacementProcessingStatus7Choice replacementProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
	 * ReplacementProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcmntPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the replacement processing status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmReplacementProcessingStatus
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmReplacementProcessingStatus}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReplacementProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RplcmntPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the replacement processing status of a trade.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmReplacementProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReplacementProcessingStatus7Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getReplacementProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlPrcgSts")
	protected CancellationProcessingStatus6Choice cancellationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice
	 * CancellationProcessingStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cancellation status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmCancellationProcessingStatus
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmCancellationProcessingStatus
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides details on the cancellation status of a trade.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmCancellationProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CancellationProcessingStatus6Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getCancellationProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PtyTradgDtls")
	protected Order18 partyTradingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Order18 Order18}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyTradgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyTradingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trading party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmPartyTradingDetails
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmPartyTradingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPartyTradingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "PtyTradgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyTradingDetails";
			definition = "Details of the trading party.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmPartyTradingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Order18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getPartyTradingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrPtyTradgDtls")
	protected Order18 counterpartyTradingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Order18 Order18}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyTradgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTradingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trading counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmCounterpartyTradingDetails
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmCounterpartyTradingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartyTradingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtyTradgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTradingDetails";
			definition = "Details of the trading counterparty.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmCounterpartyTradingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Order18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getCounterpartyTradingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ConfPties")
	protected List<ConfirmationParties4> confirmationParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmConfirmationParties
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmConfirmationParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmConfirmationParties;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationParties4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getConfirmationParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties23 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmDeliveringSettlementParties
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmDeliveringSettlementParties}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties23 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmReceivingSettlementParties
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmSupplementaryData
	 * SecuritiesTradeConfirmationStatusAdviceV01.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationStatusAdviceV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusPresenceRule.forSecuritiesTradeConfirmationStatusAdviceV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeConfirmationStatusAdviceV02";
				definition = "Scope\r\nThis message is sent from Central Matching Utility (CMU) to an executing party or an instructing party to advise the status of the SecuritiesTradeConfirmation message previously sent by the party. The status may be a processing, pending processing, affirmed or disaffirmed, cancel or replacement by an instructing party, a custodian or an affirming party, internal matching, and/or matching status.\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors. The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe ISO 20022 Business Application Header must be used\r\nUsage\r\nInitiator: In central matching the Initiator is the Central Matching Utility.\r\nRespondent: no response is needed by the recipient of the message.";
				previousVersion_lazy = () -> SecuritiesTradeConfirmationStatusAdviceV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(PostTradeMatchingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTradConfStsAdvc";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmIdentification,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmReferences, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmAffirmationStatus,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmProcessingStatus, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmMatchingStatus,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmReplacementProcessingStatus,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmCancellationProcessingStatus, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmPartyTradingDetails,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmCounterpartyTradingDetails, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmConfirmationParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmDeliveringSettlementParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmReceivingSettlementParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "044";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeConfirmationStatusAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactiontIdentification4 getIdentification() {
		return identification;
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setIdentification(TransactiontIdentification4 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<Linkages18> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setReferences(List<Linkages18> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<AffirmationStatus6Choice> getAffirmationStatus() {
		return affirmationStatus == null ? Optional.empty() : Optional.of(affirmationStatus);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setAffirmationStatus(AffirmationStatus6Choice affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
		return this;
	}

	public Optional<ProcessingStatus17Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setProcessingStatus(ProcessingStatus17Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus23Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setMatchingStatus(MatchingStatus23Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<ReplacementProcessingStatus7Choice> getReplacementProcessingStatus() {
		return replacementProcessingStatus == null ? Optional.empty() : Optional.of(replacementProcessingStatus);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setReplacementProcessingStatus(ReplacementProcessingStatus7Choice replacementProcessingStatus) {
		this.replacementProcessingStatus = replacementProcessingStatus;
		return this;
	}

	public Optional<CancellationProcessingStatus6Choice> getCancellationProcessingStatus() {
		return cancellationProcessingStatus == null ? Optional.empty() : Optional.of(cancellationProcessingStatus);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setCancellationProcessingStatus(CancellationProcessingStatus6Choice cancellationProcessingStatus) {
		this.cancellationProcessingStatus = cancellationProcessingStatus;
		return this;
	}

	public Optional<Order18> getPartyTradingDetails() {
		return partyTradingDetails == null ? Optional.empty() : Optional.of(partyTradingDetails);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setPartyTradingDetails(Order18 partyTradingDetails) {
		this.partyTradingDetails = partyTradingDetails;
		return this;
	}

	public Optional<Order18> getCounterpartyTradingDetails() {
		return counterpartyTradingDetails == null ? Optional.empty() : Optional.of(counterpartyTradingDetails);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setCounterpartyTradingDetails(Order18 counterpartyTradingDetails) {
		this.counterpartyTradingDetails = counterpartyTradingDetails;
		return this;
	}

	public List<ConfirmationParties4> getConfirmationParties() {
		return confirmationParties == null ? confirmationParties = new ArrayList<>() : confirmationParties;
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setConfirmationParties(List<ConfirmationParties4> confirmationParties) {
		this.confirmationParties = Objects.requireNonNull(confirmationParties);
		return this;
	}

	public Optional<SettlementParties23> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setDeliveringSettlementParties(SettlementParties23 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties23> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setReceivingSettlementParties(SettlementParties23 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTradeConfirmationStatusAdviceV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.02")
	static public class Document {
		@XmlElement(name = "SctiesTradConfStsAdvc", required = true)
		public SecuritiesTradeConfirmationStatusAdviceV02 messageBody;
	}
}