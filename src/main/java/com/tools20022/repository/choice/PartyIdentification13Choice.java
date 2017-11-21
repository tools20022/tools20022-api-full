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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification19;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#mmBICOrBEI
 * PartyIdentification13Choice.mmBICOrBEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#mmProprietaryIdentification
 * PartyIdentification13Choice.mmProprietaryIdentification}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmAccountOwner
 * IntraPositionMovementConfirmationV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmAccountOwner
 * IntraPositionMovementPostingReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmAccountOwner
 * SecuritiesBalanceAccountingReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmAccountOwner
 * SecuritiesBalanceCustodyReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmAccountOwner
 * SecuritiesTransactionPendingReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmAccountOwner
 * SecuritiesTransactionPostingReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmAccountOwner
 * IntraPositionMovementInstructionV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmAccountOwner
 * PortfolioTransferNotificationV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmAccountOwner
 * SecuritiesStatementQueryV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmAccountOwner
 * SecuritiesTransactionStatusQueryV01.mmAccountOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification13Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification13Choice", propOrder = {"BICOrBEI", "proprietaryIdentification"})
public class PartyIdentification13Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AnyBICIdentifier bICOrBEI;
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICOrBEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICOrBEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBICOrBEI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> PartyIdentification13Choice.mmObject();
			isDerived = false;
			xmlTag = "BICOrBEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICOrBEI";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected GenericIdentification19 proprietaryIdentification;
	/**
	 * Unique and unambiguous identifier, as assigned to a financial institution
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
	 * PartyIdentification13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PartyIdentification13Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification19.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification13Choice.mmBICOrBEI, PartyIdentification13Choice.mmProprietaryIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV01.mmAccountOwner, IntraPositionMovementPostingReportV01.mmAccountOwner, SecuritiesBalanceAccountingReportV03.mmAccountOwner,
						SecuritiesBalanceCustodyReportV03.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV01.mmAccountOwner, SecuritiesSettlementConditionsModificationRequestV01.mmAccountOwner,
						SecuritiesTransactionPendingReportV01.mmAccountOwner, SecuritiesTransactionPostingReportV01.mmAccountOwner, IntraPositionMovementInstructionV01.mmAccountOwner, PortfolioTransferNotificationV01.mmAccountOwner,
						SecuritiesSettlementTransactionAllegementReportV01.mmAccountOwner, SecuritiesStatementQueryV01.mmAccountOwner, SecuritiesStatusOrStatementQueryStatusAdviceV01.mmAccountOwner,
						SecuritiesTransactionStatusQueryV01.mmAccountOwner);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification13Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BICOrBEI", required = true)
	public AnyBICIdentifier getBICOrBEI() {
		return bICOrBEI;
	}

	public void setBICOrBEI(AnyBICIdentifier bICOrBEI) {
		this.bICOrBEI = bICOrBEI;
	}

	@XmlElement(name = "PrtryId", required = true)
	public GenericIdentification19 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification19 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}
}