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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
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
 * Unique identifier of a document, message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification1#mmIdentification
 * Identification1.mmIdentification}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmQueryReference
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV02.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV03.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV04.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmCorporateActionEventIdentification
 * IntraPositionMovementInstructionV01.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#mmCorporateActionEventIdentification
 * IntraPositionMovementInstructionV02.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementAllegementRemovalAdviceV02.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV01.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV02.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV01.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV02.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmQueryReference
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#mmQueryReference
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.mmQueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV02.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementAllegementRemovalAdviceV03.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV03.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV03.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV03.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmCorporateActionEventIdentification
 * IntraPositionMovementInstructionV03.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV04.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV04.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV05.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV06.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmQueryReference
 * SecuritiesSettlementTransactionAuditTrailReportV02.mmQueryReference}</li>
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
 * "Identification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique identifier of a document, message or transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Identification1", propOrder = "identification")
public class Identification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique identifier of a document, message or transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
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
			componentContext_lazy = () -> Identification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of a document, message or transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Identification1.mmIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV01.mmQueryReference, SecuritiesSettlementConditionModificationStatusAdviceV01.mmRequestReference,
						SecuritiesSettlementConditionModificationStatusAdviceV02.mmRequestReference, SecuritiesSettlementConditionModificationStatusAdviceV03.mmRequestReference,
						SecuritiesSettlementConditionModificationStatusAdviceV04.mmRequestReference, IntraPositionMovementInstructionV01.mmCorporateActionEventIdentification,
						IntraPositionMovementInstructionV02.mmCorporateActionEventIdentification, SecuritiesSettlementAllegementRemovalAdviceV02.mmMarketInfrastructureTransactionIdentification,
						SecuritiesSettlementTransactionAllegementNotificationV01.mmMarketInfrastructureTransactionIdentification, SecuritiesSettlementTransactionAllegementNotificationV02.mmMarketInfrastructureTransactionIdentification,
						SecuritiesSettlementTransactionReversalAdviceV01.mmConfirmationReference, SecuritiesSettlementTransactionReversalAdviceV02.mmConfirmationReference, SecuritiesStatusOrStatementQueryStatusAdviceV01.mmQueryReference,
						SecuritiesStatusOrStatementQueryStatusAdviceV02.mmQueryReference, SecuritiesTransactionCancellationRequestStatusAdviceV01.mmCancellationRequestReference,
						SecuritiesTransactionCancellationRequestStatusAdviceV02.mmCancellationRequestReference, SecuritiesSettlementAllegementRemovalAdviceV03.mmMarketInfrastructureTransactionIdentification,
						SecuritiesSettlementTransactionAllegementNotificationV03.mmMarketInfrastructureTransactionIdentification, SecuritiesSettlementTransactionReversalAdviceV03.mmConfirmationReference,
						SecuritiesTransactionCancellationRequestStatusAdviceV03.mmCancellationRequestReference, IntraPositionMovementInstructionV03.mmCorporateActionEventIdentification,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmModificationRequestReference, SecuritiesSettlementTransactionAllegementNotificationV04.mmMarketInfrastructureTransactionIdentification,
						SecuritiesSettlementTransactionReversalAdviceV04.mmConfirmationReference, SecuritiesSettlementConditionModificationStatusAdviceV05.mmRequestReference,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationRequestReference, SecuritiesTransactionCancellationRequestStatusAdviceV04.mmCancellationRequestReference,
						SecuritiesSettlementConditionModificationStatusAdviceV06.mmRequestReference, SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmModificationRequestReference,
						SecuritiesSettlementTransactionAuditTrailReportV02.mmQueryReference);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Identification1";
				definition = "Unique identifier of a document, message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}