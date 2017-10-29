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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Unique identifier of a document, message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Identification1#Identification
 * Identification1.Identification}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#QueryReference
 * SecuritiesSettlementTransactionAuditTrailReportV01.QueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV01.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV02.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV03.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV04.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#CorporateActionEventIdentification
 * IntraPositionMovementInstructionV01.CorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#CorporateActionEventIdentification
 * IntraPositionMovementInstructionV02.CorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementAllegementRemovalAdviceV02.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV01.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV02.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#ConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV01.ConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#ConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV02.ConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#QueryReference
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.QueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#QueryReference
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.QueryReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#CancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.
 * CancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02#CancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV02.
 * CancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementAllegementRemovalAdviceV03.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV03.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#ConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV03.ConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03#CancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV03.
 * CancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#CorporateActionEventIdentification
 * IntraPositionMovementInstructionV03.CorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#ModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * ModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04#MarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV04.
 * MarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#ConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV04.ConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV05.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#ModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * ModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#CancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
 * CancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#RequestReference
 * SecuritiesSettlementConditionModificationStatusAdviceV06.RequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#ModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * ModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#QueryReference
 * SecuritiesSettlementTransactionAuditTrailReportV02.QueryReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class Identification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Identification1.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of a document, message or transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification1.Identification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.QueryReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.RequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02.RequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03.RequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04.RequestReference,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.CorporateActionEventIdentification, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02.CorporateActionEventIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01.ConfirmationReference, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02.ConfirmationReference,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.QueryReference, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02.QueryReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01.CancellationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02.CancellationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03.ConfirmationReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03.CancellationRequestReference,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03.CorporateActionEventIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.ModificationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04.MarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.ConfirmationReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05.RequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.ModificationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04.CancellationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06.RequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.ModificationRequestReference,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02.QueryReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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
}