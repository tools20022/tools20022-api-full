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
import com.tools20022.repository.codeset.TradePostingCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.msg.Clearing1;
import com.tools20022.repository.msg.Clearing2;
import com.tools20022.repository.msg.Clearing3;
import com.tools20022.repository.msg.Clearing4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Mechanism allowing financial institutions that are members of a clearing
 * house to pay and to receive the amounts linked to the transactions that they
 * have executed on the market. The addition of all the positions per product
 * results in one net position (due or to receive) with the clearing house or
 * the central clearing counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Clearing" src="doc-files/Clearing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Clearing#ClearingThresholdIndicator
 * Clearing.ClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Clearing#ClearedIdentification
 * Clearing.ClearedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#GuaranteedTrade
 * Clearing.GuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#TradePostingType
 * Clearing.TradePostingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#ClearingSystem
 * Clearing.ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem#Clearing
 * ClearingSystem.Clearing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#ClearingDetails
 * TradeLeg3.ClearingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#ClearingDetails
 * TradeLeg6.ClearingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#ClearingDetails
 * TradeLeg9.ClearingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesClearing
 * SecuritiesClearing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing3 Clearing3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing1 Clearing1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing2 Clearing2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4 Clearing4}</li>
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
 * "Clearing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mechanism allowing financial institutions that are members of a clearing house to pay and to receive the amounts linked to the transactions that they have executed on the market. The addition of all the positions per product results in one net position (due or to receive) with the clearing house or the central clearing counterparty."
 * </li>
 * </ul>
 */
public class Clearing extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the contract is above or below the clearing threshold.
	 * Where N indicates the contract is below the clearing threshold and Y
	 * indicates the contract is above the clearing threshold.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ClearingThresholdIndicator
	 * RegulatoryReporting1.ClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#ClearingThresholdIndicator
	 * RegulatoryReporting4.ClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ClearingThresholdIndicator
	 * RegulatoryReporting6.ClearingThresholdIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingThresholdIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is above or below the clearing threshold. Where N indicates the contract is below the clearing threshold and Y indicates the contract is above the clearing threshold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingThresholdIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.ClearingThresholdIndicator, com.tools20022.repository.msg.RegulatoryReporting4.ClearingThresholdIndicator,
					com.tools20022.repository.msg.RegulatoryReporting6.ClearingThresholdIndicator);
			elementContext_lazy = () -> Clearing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where N indicates the contract is below the clearing threshold and Y indicates the contract is above the clearing threshold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reference number assigned by the Central Counterparty (CCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#ClearedProductIdentification
	 * RegulatoryReporting1.ClearedProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#ClearedProductIdentification
	 * RegulatoryReporting4.ClearedProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#ClearedProductIdentification
	 * RegulatoryReporting6.ClearedProductIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference number assigned by the Central Counterparty (CCP)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearedIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.ClearedProductIdentification, com.tools20022.repository.msg.RegulatoryReporting4.ClearedProductIdentification,
					com.tools20022.repository.msg.RegulatoryReporting6.ClearedProductIdentification);
			elementContext_lazy = () -> Clearing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearedIdentification";
			definition = "Reference number assigned by the Central Counterparty (CCP).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates if the central counterparty has to novate and guarantee the
	 * trade or not.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Clearing1#GuaranteedTrade
	 * Clearing1.GuaranteedTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Clearing2#GuaranteedTrade
	 * Clearing2.GuaranteedTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Clearing4#GuaranteedTrade
	 * Clearing4.GuaranteedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the central counterparty has to novate and guarantee the trade or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GuaranteedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Clearing1.GuaranteedTrade, com.tools20022.repository.msg.Clearing2.GuaranteedTrade, com.tools20022.repository.msg.Clearing4.GuaranteedTrade);
			elementContext_lazy = () -> Clearing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedTrade";
			definition = "Indicates if the central counterparty has to novate and guarantee the trade or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how a trade is maintained in the clearing account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradePostingCode
	 * TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#TradePostingCode
	 * TradeLeg5.TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#TradePostingCode
	 * TradeLeg6.TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#TradePostingCode
	 * TradeLeg7.TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#TradePostingCode
	 * TradeLeg8.TradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#TradePostingCode
	 * TradeLeg10.TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#TradePostingCode
	 * TradeLeg9.TradePostingCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePostingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how a trade is maintained in the clearing account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradePostingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeLeg5.TradePostingCode, com.tools20022.repository.msg.TradeLeg6.TradePostingCode, com.tools20022.repository.msg.TradeLeg7.TradePostingCode,
					com.tools20022.repository.msg.TradeLeg8.TradePostingCode, com.tools20022.repository.msg.TradeLeg10.TradePostingCode, com.tools20022.repository.msg.TradeLeg9.TradePostingCode);
			elementContext_lazy = () -> Clearing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingType";
			definition = "Indicates how a trade is maintained in the clearing account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradePostingCode.mmObject();
		}
	};
	/**
	 * Specifies the system which plays a role in the clearing of securities or
	 * cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#Clearing
	 * ClearingSystem.Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the clearing of securities or cash."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Clearing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Specifies the system which plays a role in the clearing of securities or cash.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.Clearing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Clearing";
				definition = "Mechanism allowing financial institutions that are members of a clearing house to pay and to receive the amounts linked to the transactions that they have executed on the market. The addition of all the positions per product results in one net position (due or to receive) with the clearing house or the central clearing counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.Clearing);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeLeg3.ClearingDetails, com.tools20022.repository.msg.TradeLeg6.ClearingDetails, com.tools20022.repository.msg.TradeLeg9.ClearingDetails);
				subType_lazy = () -> Arrays.asList(SecuritiesClearing.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.ClearingThresholdIndicator, com.tools20022.repository.entity.Clearing.ClearedIdentification,
						com.tools20022.repository.entity.Clearing.GuaranteedTrade, com.tools20022.repository.entity.Clearing.TradePostingType, com.tools20022.repository.entity.Clearing.ClearingSystem);
				derivationComponent_lazy = () -> Arrays.asList(Clearing3.mmObject(), Clearing1.mmObject(), Clearing2.mmObject(), Clearing4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}