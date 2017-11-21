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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04;
import com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique identifier of a document, message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification16#mmIdentification
 * Identification16.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotification002V05.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdvice002V05.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmQueryReference
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdvice002V04#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementAllegementRemovalAdvice002V04.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04#mmCorporateActionEventIdentification
 * IntraPositionMovementInstruction002V04.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.
 * mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotification002V06.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdvice002V06.mmConfirmationReference}</li>
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
 * "Identification16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique identifier of a document, message or transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Identification16", propOrder = "identification")
public class Identification16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text identification;
	/**
	 * Unique identifier of a document, message or transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Identification16
	 * Identification16}</li>
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
	 * definition} = "Unique identifier of a document, message or transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeIdentification.mmObject();
			componentContext_lazy = () -> Identification16.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of a document, message or transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Identification16.mmIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.mmModificationRequestReference,
						SecuritiesSettlementTransactionAllegementNotification002V05.mmMarketInfrastructureTransactionIdentification, SecuritiesSettlementTransactionReversalAdvice002V05.mmConfirmationReference,
						SecuritiesSettlementTransactionAuditTrailReport002V03.mmQueryReference, SecuritiesSettlementAllegementRemovalAdvice002V04.mmMarketInfrastructureTransactionIdentification,
						SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmCancellationRequestReference, IntraPositionMovementInstruction002V04.mmCorporateActionEventIdentification,
						SecuritiesSettlementConditionModificationStatusAdvice002V07.mmRequestReference, SecuritiesSettlementTransactionAllegementNotification002V06.mmMarketInfrastructureTransactionIdentification,
						SecuritiesSettlementTransactionReversalAdvice002V06.mmConfirmationReference);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Identification16";
				definition = "Unique identifier of a document, message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public RestrictedFINXMax16Text getIdentification() {
		return identification;
	}

	public void setIdentification(RestrictedFINXMax16Text identification) {
		this.identification = identification;
	}
}