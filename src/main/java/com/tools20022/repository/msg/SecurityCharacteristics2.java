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
import com.tools20022.repository.choice.SecurityIdentification24Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8;
import com.tools20022.repository.msg.SecuritiesPosition1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2#mmIdentification
 * SecurityCharacteristics2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2#mmPosition
 * SecurityCharacteristics2.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2#mmValuationPrice
 * SecurityCharacteristics2.mmValuationPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2#mmCollateralValue
 * SecurityCharacteristics2.mmCollateralValue}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information about the security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1
 * SecurityCharacteristics1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityCharacteristics2", propOrder = {"identification", "position", "valuationPrice", "collateralValue"})
public class SecurityCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected List<SecurityIdentification24Choice> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification24Choice
	 * SecurityIdentification24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2
	 * SecurityCharacteristics2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmIdentification
	 * SecurityCharacteristics1.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCharacteristics2, List<SecurityIdentification24Choice>> mmIdentification = new MMMessageAssociationEnd<SecurityCharacteristics2, List<SecurityIdentification24Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as known by the account owner, to unambiguously identify the security.";
			previousVersion_lazy = () -> SecurityCharacteristics1.mmIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification24Choice.mmObject();
		}

		@Override
		public List<SecurityIdentification24Choice> getValue(SecurityCharacteristics2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecurityCharacteristics2 obj, List<SecurityIdentification24Choice> value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Pos")
	protected List<SecuritiesPosition1> position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesPosition1
	 * SecuritiesPosition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2
	 * SecurityCharacteristics2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmPosition
	 * SecurityCharacteristics1.mmPosition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCharacteristics2, List<SecuritiesPosition1>> mmPosition = new MMMessageAssociationEnd<SecurityCharacteristics2, List<SecuritiesPosition1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Specifies the position for the security.";
			previousVersion_lazy = () -> SecurityCharacteristics1.mmPosition;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesPosition1.mmObject();
		}

		@Override
		public List<SecuritiesPosition1> getValue(SecurityCharacteristics2 obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(SecurityCharacteristics2 obj, List<SecuritiesPosition1> value) {
			obj.setPosition(value);
		}
	};
	@XmlElement(name = "ValtnPric", required = true)
	protected AmountPricePerFinancialInstrumentQuantity8 valuationPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity8
	 * AmountPricePerFinancialInstrumentQuantity8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2
	 * SecurityCharacteristics2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmValuationPrice
	 * SecurityCharacteristics1.mmValuationPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCharacteristics2, AmountPricePerFinancialInstrumentQuantity8> mmValuationPrice = new MMMessageAttribute<SecurityCharacteristics2, AmountPricePerFinancialInstrumentQuantity8>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "ValtnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationPrice";
			definition = "Specifies the price of the security for valuation purposes.";
			previousVersion_lazy = () -> SecurityCharacteristics1.mmValuationPrice;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountPricePerFinancialInstrumentQuantity8.mmObject();
		}

		@Override
		public AmountPricePerFinancialInstrumentQuantity8 getValue(SecurityCharacteristics2 obj) {
			return obj.getValuationPrice();
		}

		@Override
		public void setValue(SecurityCharacteristics2 obj, AmountPricePerFinancialInstrumentQuantity8 value) {
			obj.setValuationPrice(value);
		}
	};
	@XmlElement(name = "CollVal", required = true)
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2
	 * SecurityCharacteristics2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics1#mmCollateralValue
	 * SecurityCharacteristics1.mmCollateralValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCharacteristics2, ActiveCurrencyAndAmount> mmCollateralValue = new MMMessageAttribute<SecurityCharacteristics2, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Specifies the value of the security for collateral purposes.";
			previousVersion_lazy = () -> SecurityCharacteristics1.mmCollateralValue;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SecurityCharacteristics2 obj) {
			return obj.getCollateralValue();
		}

		@Override
		public void setValue(SecurityCharacteristics2 obj, ActiveCurrencyAndAmount value) {
			obj.setCollateralValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityCharacteristics2.mmIdentification, com.tools20022.repository.msg.SecurityCharacteristics2.mmPosition,
						com.tools20022.repository.msg.SecurityCharacteristics2.mmValuationPrice, com.tools20022.repository.msg.SecurityCharacteristics2.mmCollateralValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCharacteristics2";
				definition = "Set of elements used to provide detailed information about the security.";
				previousVersion_lazy = () -> SecurityCharacteristics1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityIdentification24Choice> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public SecurityCharacteristics2 setIdentification(List<SecurityIdentification24Choice> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<SecuritiesPosition1> getPosition() {
		return position == null ? position = new ArrayList<>() : position;
	}

	public SecurityCharacteristics2 setPosition(List<SecuritiesPosition1> position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public AmountPricePerFinancialInstrumentQuantity8 getValuationPrice() {
		return valuationPrice;
	}

	public SecurityCharacteristics2 setValuationPrice(AmountPricePerFinancialInstrumentQuantity8 valuationPrice) {
		this.valuationPrice = Objects.requireNonNull(valuationPrice);
		return this;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public SecurityCharacteristics2 setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = Objects.requireNonNull(collateralValue);
		return this;
	}
}