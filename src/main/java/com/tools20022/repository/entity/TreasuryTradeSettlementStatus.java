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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementStatusCode;
import com.tools20022.repository.codeset.TradeStatusCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a treasury trade at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTradeSettlementStatus"
 * src="doc-files/TreasuryTradeSettlementStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TradeStatus
 * TreasuryTradeSettlementStatus.TradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#AllegedTrade
 * TreasuryTradeSettlementStatus.AllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TreasuryTrade
 * TreasuryTradeSettlementStatus.TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#Settlement
 * TreasuryTradeSettlementStatus.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#RejectedAmount
 * TreasuryTradeSettlementStatus.RejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#SettlementSuspended
 * TreasuryTradeSettlementStatus.SettlementSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#PendingSettlement
 * TreasuryTradeSettlementStatus.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#SettlementDate
 * TreasuryTradeSettlementStatus.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#WithdrawalReason
 * TreasuryTradeSettlementStatus.WithdrawalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasuryTradeSettlementStatus
 * TreasuryTrade.TreasuryTradeSettlementStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#CurrentStatus
 * TradeData10.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#CurrentStatusSubType
 * TradeData10.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#PreviousStatus
 * TradeData10.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#PreviousStatusSubType
 * TradeData10.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#CurrentStatus
 * TradeData9.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#CurrentStatusSubType
 * TradeData9.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#PreviousStatus
 * TradeData9.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#PreviousStatusSubType
 * TradeData9.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#CurrentStatus
 * TradeData7.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#CurrentStatusSubType
 * TradeData7.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#PreviousStatus
 * TradeData7.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#PreviousStatusSubType
 * TradeData7.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#CurrentStatus
 * TradeData14.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#CurrentStatusSubType
 * TradeData14.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#PreviousStatus
 * TradeData14.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#PreviousStatusSubType
 * TradeData14.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#CurrentStatus
 * TradeData12.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#CurrentStatusSubType
 * TradeData12.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#PreviousStatus
 * TradeData12.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#PreviousStatusSubType
 * TradeData12.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#CurrentStatus
 * TradeData15.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#CurrentStatusSubType
 * TradeData15.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#PreviousStatus
 * TradeData15.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#PreviousStatusSubType
 * TradeData15.PreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#CurrentStatus
 * TradeData16.CurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#CurrentStatusSubType
 * TradeData16.CurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#PreviousStatus
 * TradeData16.PreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#PreviousStatusSubType
 * TradeData16.PreviousStatusSubType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1 TradeData1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status5Choice Status5Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status13Choice
 * Status13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndSubStatus1
 * StatusAndSubStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData8 TradeData8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9 TradeData9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status6Choice Status6Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7 TradeData7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData11 TradeData11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14 TradeData14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15 TradeData15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndSubStatus2
 * StatusAndSubStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice
 * Status28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice
 * Status27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16 TradeData16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TreasuryTradeSettlementStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a treasury trade at a specified time."
 * </li>
 * </ul>
 */
public class TreasuryTradeSettlementStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of a treasury trade in a central matching/settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#CurrentStatus
	 * TradeData1.CurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#ExtendedCurrentStatus
	 * TradeData1.ExtendedCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#CurrentStatusSubType
	 * TradeData1.CurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#PreviousStatus
	 * TradeData1.PreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#ExtendedPreviousStatus
	 * TradeData1.ExtendedPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#PreviousStatusSubType
	 * TradeData1.PreviousStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status5Choice#Code
	 * Status5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status5Choice#Proprietary
	 * Status5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData4#CurrentStatus
	 * TradeData4.CurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData4#CurrentStatusSubType
	 * TradeData4.CurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status13Choice#Code
	 * Status13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status13Choice#Proprietary
	 * Status13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus1#StatusCode
	 * StatusAndSubStatus1.StatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus1#SubStatusCode
	 * StatusAndSubStatus1.SubStatusCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData3#CurrentStatus
	 * TradeData3.CurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData3#CurrentStatusSubType
	 * TradeData3.CurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData2#CurrentStatus
	 * TradeData2.CurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#ExtendedCurrentStatus
	 * TradeData2.ExtendedCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#CurrentStatusSubType
	 * TradeData2.CurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData2#PreviousStatus
	 * TradeData2.PreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#ExtendedPreviousStatus
	 * TradeData2.ExtendedPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#PreviousStatusSubType
	 * TradeData2.PreviousStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status6Choice#Code
	 * Status6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status6Choice#Proprietary
	 * Status6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#CurrentStatus
	 * TradeData6.CurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData6#CurrentStatusSubType
	 * TradeData6.CurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#Status
	 * TradeStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#ExtendedStatus
	 * TradeStatus1.ExtendedStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#StatusSubType
	 * TradeStatus1.StatusSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#StatusCode
	 * StatusAndSubStatus2.StatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#SubStatusCode
	 * StatusAndSubStatus2.SubStatusCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice#Code
	 * Status28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status28Choice#Proprietary
	 * Status28Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice#Code
	 * Status27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status27Choice#Proprietary
	 * Status27Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a treasury trade in a central matching/settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData1.CurrentStatus, com.tools20022.repository.msg.TradeData1.ExtendedCurrentStatus, com.tools20022.repository.msg.TradeData1.CurrentStatusSubType,
					com.tools20022.repository.msg.TradeData1.PreviousStatus, com.tools20022.repository.msg.TradeData1.ExtendedPreviousStatus, com.tools20022.repository.msg.TradeData1.PreviousStatusSubType,
					com.tools20022.repository.choice.Status5Choice.Code, com.tools20022.repository.choice.Status5Choice.Proprietary, com.tools20022.repository.msg.TradeData4.CurrentStatus,
					com.tools20022.repository.msg.TradeData4.CurrentStatusSubType, com.tools20022.repository.choice.Status13Choice.Code, com.tools20022.repository.choice.Status13Choice.Proprietary,
					com.tools20022.repository.msg.StatusAndSubStatus1.StatusCode, com.tools20022.repository.msg.StatusAndSubStatus1.SubStatusCode, com.tools20022.repository.msg.TradeData3.CurrentStatus,
					com.tools20022.repository.msg.TradeData3.CurrentStatusSubType, com.tools20022.repository.msg.TradeData2.CurrentStatus, com.tools20022.repository.msg.TradeData2.ExtendedCurrentStatus,
					com.tools20022.repository.msg.TradeData2.CurrentStatusSubType, com.tools20022.repository.msg.TradeData2.PreviousStatus, com.tools20022.repository.msg.TradeData2.ExtendedPreviousStatus,
					com.tools20022.repository.msg.TradeData2.PreviousStatusSubType, com.tools20022.repository.choice.Status6Choice.Code, com.tools20022.repository.choice.Status6Choice.Proprietary,
					com.tools20022.repository.msg.TradeData6.CurrentStatus, com.tools20022.repository.msg.TradeData6.CurrentStatusSubType, com.tools20022.repository.msg.TradeStatus1.Status,
					com.tools20022.repository.msg.TradeStatus1.ExtendedStatus, com.tools20022.repository.msg.TradeStatus1.StatusSubType, com.tools20022.repository.msg.StatusAndSubStatus2.StatusCode,
					com.tools20022.repository.msg.StatusAndSubStatus2.SubStatusCode, com.tools20022.repository.choice.Status28Choice.Code, com.tools20022.repository.choice.Status28Choice.Proprietary,
					com.tools20022.repository.choice.Status27Choice.Code, com.tools20022.repository.choice.Status27Choice.Proprietary);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeStatus";
			definition = "Status of a treasury trade in a central matching/settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeStatusCode.mmObject();
		}
	};
	/**
	 * Specifies whether a trade is alleged (notified by the counterparty) or
	 * not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#AllegedTrade
	 * TradeData9.AllegedTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#AllegedTrade
	 * TradeStatus1.AllegedTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#AllegedTrade
	 * TradeData14.AllegedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a trade is alleged (notified by the counterparty) or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData9.AllegedTrade, com.tools20022.repository.msg.TradeStatus1.AllegedTrade, com.tools20022.repository.msg.TradeData14.AllegedTrade);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged (notified by the counterparty) or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Treasury trade for which a settlement status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasuryTradeSettlementStatus
	 * TreasuryTrade.TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Treasury trade for which a settlement status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasuryTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Treasury trade for which a settlement status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of a settlement eg rejected, settled or awaiting
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#SettlementStatus
	 * SettlementData1.SettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#SettlementStatus
	 * SettlementData2.SettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a settlement eg rejected, settled or awaiting authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Settlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData1.SettlementStatus, com.tools20022.repository.msg.SettlementData2.SettlementStatus);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	/**
	 * Amount that cannot be settled for instance by a settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#RejectedAmount
	 * SettlementData1.RejectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#RejectedAmount
	 * SettlementData2.RejectedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that cannot be settled for instance by a settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RejectedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData1.RejectedAmount, com.tools20022.repository.msg.SettlementData2.RejectedAmount);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled for instance by a settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash settlement is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#Suspended
	 * SettlementData1.Suspended}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#Suspended
	 * SettlementData2.Suspended}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementSuspended = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData1.Suspended, com.tools20022.repository.msg.SettlementData2.Suspended);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSuspended";
			definition = "Cash settlement is suspended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Cash settlement is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#Pending
	 * SettlementData1.Pending}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#Pending
	 * SettlementData2.Pending}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData1.Pending, com.tools20022.repository.msg.SettlementData2.Pending);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Cash settlement is pending.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which the trade is actually settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#SettlementDate
	 * Trade3.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#FixingDate
	 * Trade3.FixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trade is actually settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trade3.SettlementDate, com.tools20022.repository.msg.Trade3.FixingDate);
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is actually settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Reason that an alleged trade is withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason that an alleged trade is withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WithdrawalReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalReason";
			definition = "Reason that an alleged trade is withdrawn.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradeSettlementStatus";
				definition = "Specifies the status of a treasury trade at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData10.CurrentStatus, com.tools20022.repository.msg.TradeData10.CurrentStatusSubType, com.tools20022.repository.msg.TradeData10.PreviousStatus,
						com.tools20022.repository.msg.TradeData10.PreviousStatusSubType, com.tools20022.repository.msg.TradeData9.CurrentStatus, com.tools20022.repository.msg.TradeData9.CurrentStatusSubType,
						com.tools20022.repository.msg.TradeData9.PreviousStatus, com.tools20022.repository.msg.TradeData9.PreviousStatusSubType, com.tools20022.repository.msg.TradeData7.CurrentStatus,
						com.tools20022.repository.msg.TradeData7.CurrentStatusSubType, com.tools20022.repository.msg.TradeData7.PreviousStatus, com.tools20022.repository.msg.TradeData7.PreviousStatusSubType,
						com.tools20022.repository.msg.TradeData14.CurrentStatus, com.tools20022.repository.msg.TradeData14.CurrentStatusSubType, com.tools20022.repository.msg.TradeData14.PreviousStatus,
						com.tools20022.repository.msg.TradeData14.PreviousStatusSubType, com.tools20022.repository.msg.TradeData12.CurrentStatus, com.tools20022.repository.msg.TradeData12.CurrentStatusSubType,
						com.tools20022.repository.msg.TradeData12.PreviousStatus, com.tools20022.repository.msg.TradeData12.PreviousStatusSubType, com.tools20022.repository.msg.TradeData15.CurrentStatus,
						com.tools20022.repository.msg.TradeData15.CurrentStatusSubType, com.tools20022.repository.msg.TradeData15.PreviousStatus, com.tools20022.repository.msg.TradeData15.PreviousStatusSubType,
						com.tools20022.repository.msg.TradeData16.CurrentStatus, com.tools20022.repository.msg.TradeData16.CurrentStatusSubType, com.tools20022.repository.msg.TradeData16.PreviousStatus,
						com.tools20022.repository.msg.TradeData16.PreviousStatusSubType);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TradeStatus, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.AllegedTrade,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.Settlement,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.RejectedAmount, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementSuspended,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.PendingSettlement, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementDate,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.WithdrawalReason);
				derivationComponent_lazy = () -> Arrays.asList(TradeData1.mmObject(), Status5Choice.mmObject(), Status13Choice.mmObject(), StatusAndSubStatus1.mmObject(), TradeData10.mmObject(), TradeData8.mmObject(),
						TradeData9.mmObject(), Status6Choice.mmObject(), TradeData7.mmObject(), TradeStatus1.mmObject(), TradeData11.mmObject(), TradeData14.mmObject(), TradeData12.mmObject(), TradeData15.mmObject(),
						StatusAndSubStatus2.mmObject(), Status28Choice.mmObject(), Status27Choice.mmObject(), TradeData16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}