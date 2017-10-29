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
import com.tools20022.repository.choice.WarrantStyle2Choice;
import com.tools20022.repository.codeset.WarrantStyleCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.msg.Warrant1;
import com.tools20022.repository.msg.Warrant2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instrument that gives the holder the right to purchase shares or
 * bonds at a given price within a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Warrant" src="doc-files/Warrant.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#SubscriptionPrice
 * Warrant.SubscriptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#Multiplier
 * Warrant.Multiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#Style Warrant.Style}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#WarrantParity
 * Warrant.WarrantParity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedWarrant
 * SecuritiesPricing.RelatedWarrant}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#warrant
 * QuantityRatio.warrant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Warrant
 * FinancialInstrumentProperties1Choice.Warrant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28#Warrant
 * FinancialInstrument28.Warrant}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant1 Warrant1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.WarrantStyle2Choice
 * WarrantStyle2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2 Warrant2}</li>
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
 * "Warrant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time."
 * </li>
 * </ul>
 */
public class Warrant extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-determined price at which the holder of a warrant is entitled to buy
	 * the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedWarrant
	 * SecuritiesPricing.RelatedWarrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#SubscriptionPrice
	 * FinancialInstrumentAttributes8.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#SubscriptionPrice
	 * FinancialInstrumentAttributes20.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#SubscriptionPrice
	 * FinancialInstrumentAttributes35.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#SubscriptionPrice
	 * FinancialInstrumentAttributes41.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#SubscriptionPrice
	 * FinancialInstrumentAttributes4.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#SubscriptionPrice
	 * FinancialInstrumentAttributes13.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#SubscriptionPrice
	 * FinancialInstrumentAttributes21.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#SubscriptionPrice
	 * FinancialInstrumentAttributes26.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#SubscriptionPrice
	 * FinancialInstrumentAttributes36.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#SubscriptionPrice
	 * FinancialInstrumentAttributes42.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#SubscriptionPrice
	 * FinancialInstrumentAttributes27.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#SubscriptionPrice
	 * FinancialInstrumentAttributes14.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#SubscriptionPrice
	 * FinancialInstrumentAttributes30.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#SubscriptionPrice
	 * FinancialInstrumentAttributes28.SubscriptionPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant1#SubscriptionPrice
	 * Warrant1.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#SubscriptionPrice
	 * FinancialInstrumentAttributes31.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#SubscriptionPrice
	 * FinancialInstrumentAttributes44.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#SubscriptionPrice
	 * FinancialInstrumentAttributes15.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#SubscriptionPrice
	 * FinancialInstrumentAttributes29.SubscriptionPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#SubscriptionPrice
	 * Warrant2.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#SubscriptionPrice
	 * FinancialInstrumentAttributes2.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#SubscriptionPrice
	 * FinancialInstrumentAttributes63.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#SubscriptionPrice
	 * FinancialInstrumentAttributes64.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#SubscriptionPrice
	 * FinancialInstrumentAttributes75.SubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#SubscriptionPrice
	 * FinancialInstrumentAttributes78.SubscriptionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes20.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes41.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes13.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes26.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes42.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes14.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes28.SubscriptionPrice, com.tools20022.repository.msg.Warrant1.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes44.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes29.SubscriptionPrice, com.tools20022.repository.msg.Warrant2.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes63.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.SubscriptionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes75.SubscriptionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.SubscriptionPrice);
			elementContext_lazy = () -> Warrant.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the ratio or multiply factor used to convert from contracts to
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant1#Multiplier
	 * Warrant1.Multiplier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#Multiplier
	 * Warrant2.Multiplier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Multiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Warrant1.Multiplier, com.tools20022.repository.msg.Warrant2.Multiplier);
			elementContext_lazy = () -> Warrant.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Multiplier";
			definition = "Specifies the ratio or multiply factor used to convert from contracts to shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Specifies the expiration style of the warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WarrantStyleCode
	 * WarrantStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WarrantStyle2Choice#Code
	 * WarrantStyle2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WarrantStyle2Choice#Proprietary
	 * WarrantStyle2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#Type
	 * Warrant2.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Style"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expiration style of the warrant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Style = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.WarrantStyle2Choice.Code, com.tools20022.repository.choice.WarrantStyle2Choice.Proprietary, com.tools20022.repository.msg.Warrant2.Type);
			elementContext_lazy = () -> Warrant.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Style";
			definition = "Specifies the expiration style of the warrant.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WarrantStyleCode.mmObject();
		}
	};
	/**
	 * Provides the ratio between the quantity of warrants and the quantity of
	 * underlying securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#warrant
	 * QuantityRatio.warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.QuantityRatio
	 * QuantityRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#WarrantParity
	 * FinancialInstrumentAttributes48.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#WarrantParity
	 * FinancialInstrumentAttributes55.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#WarrantParity
	 * FinancialInstrumentAttributes66.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#WarrantParity
	 * FinancialInstrumentAttributes70.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#WarrantParity
	 * FinancialInstrumentAttributes79.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#WarrantParity
	 * FinancialInstrumentAttributes85.WarrantParity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Warrant
	 * Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the ratio between the quantity of warrants and the quantity of underlying securities. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd WarrantParity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes48.WarrantParity, com.tools20022.repository.msg.FinancialInstrumentAttributes55.WarrantParity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.WarrantParity, com.tools20022.repository.msg.FinancialInstrumentAttributes70.WarrantParity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.WarrantParity, com.tools20022.repository.msg.FinancialInstrumentAttributes85.WarrantParity);
			elementContext_lazy = () -> Warrant.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParity";
			definition = "Provides the ratio between the quantity of warrants and the quantity of underlying securities. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.warrant;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Warrant";
				definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant, com.tools20022.repository.entity.QuantityRatio.warrant);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Warrant, com.tools20022.repository.msg.FinancialInstrument28.Warrant);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.SubscriptionPrice, com.tools20022.repository.entity.Warrant.Multiplier, com.tools20022.repository.entity.Warrant.Style,
						com.tools20022.repository.entity.Warrant.WarrantParity);
				derivationComponent_lazy = () -> Arrays.asList(Warrant1.mmObject(), WarrantStyle2Choice.mmObject(), Warrant2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}