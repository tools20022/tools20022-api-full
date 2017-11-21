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
import com.tools20022.repository.codeset.CollateralType2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the current and market value of the collateral held.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#mmPostHaircutValue
 * Collateral3.mmPostHaircutValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#mmMarketValue
 * Collateral3.mmMarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#mmCollateralType
 * Collateral3.mmCollateralType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
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
 * "Collateral3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the current and market value of the collateral held."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Collateral3", propOrder = {"postHaircutValue", "marketValue", "collateralType"})
public class Collateral3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount postHaircutValue;
	/**
	 * Value of the collateral after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmPostHaircutValue
	 * AssetHolding.mmPostHaircutValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral3 Collateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstHrcutVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostHaircutValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostHaircutValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmPostHaircutValue;
			componentContext_lazy = () -> Collateral3.mmObject();
			isDerived = false;
			xmlTag = "PstHrcutVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketValue;
	/**
	 * Value of the underlying collateral (cash, securities, LoC) based on
	 * current market prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral3 Collateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the underlying collateral (cash, securities, LoC) based on current market prices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> Collateral3.mmObject();
			isDerived = false;
			xmlTag = "MktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValue";
			definition = "Value of the underlying collateral (cash, securities, LoC) based on current market prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected CollateralType2Code collateralType;
	/**
	 * Provides the type of collateral, such as securities or cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType2Code
	 * CollateralType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
	 * Collateral.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral3 Collateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the type of collateral, such as securities or cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> Collateral3.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Provides the type of collateral, such as securities or cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralType2Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Collateral3.mmPostHaircutValue, Collateral3.mmMarketValue, Collateral3.mmCollateralType);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral3";
				definition = "Provides the current and market value of the collateral held.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PstHrcutVal", required = true)
	public ActiveCurrencyAndAmount getPostHaircutValue() {
		return postHaircutValue;
	}

	public void setPostHaircutValue(ActiveCurrencyAndAmount postHaircutValue) {
		this.postHaircutValue = postHaircutValue;
	}

	@XmlElement(name = "MktVal", required = true)
	public ActiveCurrencyAndAmount getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
	}

	@XmlElement(name = "CollTp", required = true)
	public CollateralType2Code getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralType2Code collateralType) {
		this.collateralType = collateralType;
	}
}