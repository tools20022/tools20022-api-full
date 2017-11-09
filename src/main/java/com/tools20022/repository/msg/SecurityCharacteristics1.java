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
import com.tools20022.repository.choice.SecurityIdentification10Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of elements used to provide detailed information about the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmIdentification
 * SecurityCharacteristics1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmPosition
 * SecurityCharacteristics1.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmValuationPrice
 * SecurityCharacteristics1.mmValuationPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmCollateralValue
 * SecurityCharacteristics1.mmCollateralValue}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCharacteristics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information about the security."</li>
 * </ul>
 */
public class SecurityCharacteristics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecurityIdentification10Choice> identification;
	/**
	 * Unique identification, as known by the account owner, to unambiguously
	 * identify the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice
	 * SecurityIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1
	 * SecurityCharacteristics1}</li>
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
	 * "Unique identification, as known by the account owner, to unambiguously identify the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as known by the account owner, to unambiguously identify the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification10Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesPosition1> position;
	/**
	 * Specifies the position for the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesPosition1
	 * SecuritiesPosition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1
	 * SecurityCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the position for the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPosition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Specifies the position for the security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesPosition1.mmObject();
		}
	};
	protected AmountPricePerFinancialInstrumentQuantity5 valuationPrice;
	/**
	 * Specifies the price of the security for valuation purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5
	 * AmountPricePerFinancialInstrumentQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1
	 * SecurityCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the security for valuation purposes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "ValtnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationPrice";
			definition = "Specifies the price of the security for valuation purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * Specifies the value of the security for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1
	 * SecurityCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the security for collateral purposes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Specifies the value of the security for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityCharacteristics1.mmIdentification, SecurityCharacteristics1.mmPosition, SecurityCharacteristics1.mmValuationPrice, SecurityCharacteristics1.mmCollateralValue);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCharacteristics1";
				definition = "Set of elements used to provide detailed information about the security.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityIdentification10Choice> getIdentification() {
		return identification;
	}

	public void setIdentification(List<SecurityIdentification10Choice> identification) {
		this.identification = identification;
	}

	public List<SecuritiesPosition1> getPosition() {
		return position;
	}

	public void setPosition(List<com.tools20022.repository.msg.SecuritiesPosition1> position) {
		this.position = position;
	}

	public AmountPricePerFinancialInstrumentQuantity5 getValuationPrice() {
		return valuationPrice;
	}

	public void setValuationPrice(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity5 valuationPrice) {
		this.valuationPrice = valuationPrice;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = collateralValue;
	}
}