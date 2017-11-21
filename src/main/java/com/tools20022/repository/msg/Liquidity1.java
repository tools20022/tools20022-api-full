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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Liquidity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Ability of a financial instrument to be easily traded and converted to cash,
 * at conditions that do not affect its price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Liquidity1#mmValue
 * Liquidity1.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Liquidity1#mmNumberOfSecurities
 * Liquidity1.mmNumberOfSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Liquidity1#mmUpper
 * Liquidity1.mmUpper}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Liquidity1#mmLower
 * Liquidity1.mmLower}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}</li>
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
 * "Liquidity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Liquidity1", propOrder = {"value", "numberOfSecurities", "upper", "lower"})
public class Liquidity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount value;
	/**
	 * Market value of the securities position for which liquidity details are
	 * provided.
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
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmValue
	 * Liquidity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Liquidity1
	 * Liquidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market value of the securities position for which liquidity details are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmValue;
			componentContext_lazy = () -> Liquidity1.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Market value of the securities position for which liquidity details are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber numberOfSecurities;
	/**
	 * Number of securities for which liquidity range details are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Liquidity1
	 * Liquidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities for which liquidity range details are provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfSecurities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Liquidity1.mmObject();
			isDerived = false;
			xmlTag = "NbOfScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfSecurities";
			definition = "Number of securities for which liquidity range details are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected PercentageRate upper;
	/**
	 * Upper liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmUpper
	 * Liquidity.mmUpper}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Liquidity1
	 * Liquidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Upper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Upper liquidity indicator, represented as a percentage of the average trade daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpper = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmUpper;
			componentContext_lazy = () -> Liquidity1.mmObject();
			isDerived = false;
			xmlTag = "Upper";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Upper";
			definition = "Upper liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate lower;
	/**
	 * Lower liquidity indicator, represented as a percentage of the average
	 * trade daily volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmLower
	 * Liquidity.mmLower}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Liquidity1
	 * Liquidity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lwr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lower liquidity indicator, represented as a percentage of the average trade daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLower = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmLower;
			componentContext_lazy = () -> Liquidity1.mmObject();
			isDerived = false;
			xmlTag = "Lwr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lower";
			definition = "Lower liquidity indicator, represented as a percentage of the average trade daily volume.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Liquidity1.mmValue, Liquidity1.mmNumberOfSecurities, Liquidity1.mmUpper, Liquidity1.mmLower);
				trace_lazy = () -> Liquidity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Liquidity1";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Val")
	public ActiveCurrencyAndAmount getValue() {
		return value;
	}

	public void setValue(ActiveCurrencyAndAmount value) {
		this.value = value;
	}

	@XmlElement(name = "NbOfScties")
	public DecimalNumber getNumberOfSecurities() {
		return numberOfSecurities;
	}

	public void setNumberOfSecurities(DecimalNumber numberOfSecurities) {
		this.numberOfSecurities = numberOfSecurities;
	}

	@XmlElement(name = "Upper")
	public PercentageRate getUpper() {
		return upper;
	}

	public void setUpper(PercentageRate upper) {
		this.upper = upper;
	}

	@XmlElement(name = "Lwr")
	public PercentageRate getLower() {
		return lower;
	}

	public void setLower(PercentageRate lower) {
		this.lower = lower;
	}
}