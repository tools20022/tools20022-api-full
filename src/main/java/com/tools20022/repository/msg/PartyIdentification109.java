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
import com.tools20022.repository.choice.PartyIdentification114Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.PartyIdentification109#mmIdentification
 * PartyIdentification109.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification109#mmLEI
 * PartyIdentification109.mmLEI}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReport002V05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04#mmAccountOwner
 * PortfolioTransferNotification002V04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06#mmAccountOwner
 * SecuritiesTransactionPostingReport002V06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdvice002V04#mmAccountOwner
 * SecuritiesSettlementAllegementRemovalAdvice002V04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V06#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequest002V06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04#mmAccountOwner
 * SecuritiesTransactionStatusQuery002V04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdvice002V05#mmAccountOwner
 * SecuritiesMessageCancellationAdvice002V05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09#mmAccountOwner
 * SecuritiesBalanceAccountingReport002V09.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07#mmAccountOwner
 * SecuritiesTransactionPendingReport002V07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06#mmAccountOwner
 * SecuritiesStatementQuery002V06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09#mmAccountOwner
 * SecuritiesBalanceCustodyReport002V09.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdvice002V04#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdvice002V04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05#mmAccountOwner
 * SecuritiesTransactionCancellationRequest002V05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.mmAccountOwner}</li>
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
 * "PartyIdentification109"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification119
 * PartyIdentification119}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyIdentification98
 * PartyIdentification98}</li>
 * </ul>
 */
public class PartyIdentification109 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification114Choice identification;
	/**
	 * Unique identification of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice
	 * PartyIdentification114Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification119#mmIdentification
	 * PartyIdentification119.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#mmIdentification
	 * PartyIdentification98.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification109.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification119.mmIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PartyIdentification98.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification114Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification119#mmLEI
	 * PartyIdentification119.mmLEI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#mmLEI
	 * PartyIdentification98.mmLEI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLEI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification109.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identification as an alternate identification for a party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification119.mmLEI);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PartyIdentification98.mmLEI;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification109.mmIdentification, com.tools20022.repository.msg.PartyIdentification109.mmLEI);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05.mmAccountOwner, com.tools20022.repository.area.sese.PortfolioTransferNotification002V04.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdvice002V04.mmAccountOwner, com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V06.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdvice002V05.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06.mmAccountOwner, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdvice002V04.mmAccountOwner, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmAccountOwner);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification109";
				definition = "Identification of the party.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentification119.mmObject());
				previousVersion_lazy = () -> PartyIdentification98.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification114Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification114Choice identification) {
		this.identification = identification;
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public void setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
	}
}