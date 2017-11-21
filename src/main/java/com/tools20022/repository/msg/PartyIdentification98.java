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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.PartyIdentification92Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#mmIdentification
 * PartyIdentification98.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification98#mmLEI
 * PartyIdentification98.mmLEI}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmAccountOwner
 * SecuritiesBalanceCustodyReportV09.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04#mmAccountOwner
 * PortfolioTransferNotificationV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmAccountOwner
 * SecuritiesTransactionPostingReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05#mmAccountOwner
 * SecuritiesMessageCancellationAdviceV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV06#mmAccountOwner
 * SecuritiesStatementQueryV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV07#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV04#mmAccountOwner
 * SecuritiesTransactionStatusQueryV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV04#mmAccountOwner
 * SecuritiesSettlementAllegementRemovalAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05#mmAccountOwner
 * SecuritiesTransactionCancellationRequestV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountOwner
 * SecuritiesBalanceAccountingReportV09.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmAccountOwner
 * SecuritiesTransactionPendingReportV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV06#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08#mmAccountOwner
 * SecuritiesTransactionPendingReportV08.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmAccountOwner
 * SecuritiesTransactionPostingReportV07.mmAccountOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification98"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification109
 * PartyIdentification109}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification98", propOrder = {"identification", "LEI"})
public class PartyIdentification98 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification92Choice identification;
	/**
	 * Unique identification of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
	 * PartyIdentification92Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
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
	 * definition} = "Unique identification of the party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109#mmIdentification
	 * PartyIdentification109.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification98.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentification109.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification92Choice.mmObject();
		}
	};
	protected LEIIdentifier lEI;
	/**
	 * Legal entity identification as an alternate identification for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity identification as an alternate identification for a party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109#mmLEI
	 * PartyIdentification109.mmLEI}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLEI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification98.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identification as an alternate identification for a party.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentification109.mmLEI);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification98.mmIdentification, PartyIdentification98.mmLEI);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV09.mmAccountOwner, SecuritiesSettlementConditionsModificationRequestV06.mmAccountOwner, PortfolioTransferNotificationV04.mmAccountOwner,
						SecuritiesTransactionPostingReportV06.mmAccountOwner, SecuritiesStatusOrStatementQueryStatusAdviceV04.mmAccountOwner, SecuritiesMessageCancellationAdviceV05.mmAccountOwner,
						SecuritiesStatementQueryV06.mmAccountOwner, SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV07.mmAccountOwner,
						SecuritiesTransactionStatusQueryV04.mmAccountOwner, SecuritiesSettlementAllegementRemovalAdviceV04.mmAccountOwner, SecuritiesTransactionCancellationRequestV05.mmAccountOwner,
						SecuritiesBalanceAccountingReportV09.mmAccountOwner, SecuritiesSettlementTransactionAllegementReportV05.mmAccountOwner, SecuritiesSettlementTransactionAuditTrailReportV03.mmAccountOwner,
						SecuritiesTransactionPendingReportV07.mmAccountOwner, SecuritiesSettlementConditionsModificationRequestV07.mmAccountOwner, SecuritiesSettlementTransactionAllegementReportV06.mmAccountOwner,
						SecuritiesTransactionPendingReportV08.mmAccountOwner, SecuritiesTransactionPostingReportV07.mmAccountOwner);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification98";
				definition = "Identification of the party.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentification109.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public PartyIdentification92Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification92Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "LEI")
	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}
}