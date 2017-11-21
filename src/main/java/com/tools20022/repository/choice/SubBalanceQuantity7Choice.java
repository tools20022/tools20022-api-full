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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification144;
import com.tools20022.repository.msg.QuantityAndAvailability2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmQuantity
 * SubBalanceQuantity7Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmProprietary
 * SubBalanceQuantity7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice#mmQuantityAndAvailability
 * SubBalanceQuantity7Choice.mmQuantityAndAvailability}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "SubBalanceQuantity7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the balance information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubBalanceQuantity7Choice", propOrder = {"quantity", "proprietary", "quantityAndAvailability"})
public class SubBalanceQuantity7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity15Choice quantity;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice
	 * SubBalanceQuantity7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> SubBalanceQuantity7Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected GenericIdentification144 proprietary;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification144
	 * GenericIdentification144}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice
	 * SubBalanceQuantity7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> SubBalanceQuantity7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification144.mmObject();
		}
	};
	protected QuantityAndAvailability2 quantityAndAvailability;
	/**
	 * Quantity of securities in the sub-balance and whether the balance is
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability2
	 * QuantityAndAvailability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity7Choice
	 * SubBalanceQuantity7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAvlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities in the sub-balance and whether the balance is available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityAndAvailability = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> SubBalanceQuantity7Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyAndAvlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAvailability";
			definition = "Quantity of securities in the sub-balance and whether the balance is available.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAvailability2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubBalanceQuantity7Choice.mmQuantity, SubBalanceQuantity7Choice.mmProprietary, SubBalanceQuantity7Choice.mmQuantityAndAvailability);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubBalanceQuantity7Choice";
				definition = "Choice between formats for the balance information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Qty", required = true)
	public FinancialInstrumentQuantity15Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "Prtry", required = true)
	public GenericIdentification144 getProprietary() {
		return proprietary;
	}

	public void setProprietary(GenericIdentification144 proprietary) {
		this.proprietary = proprietary;
	}

	@XmlElement(name = "QtyAndAvlbty", required = true)
	public QuantityAndAvailability2 getQuantityAndAvailability() {
		return quantityAndAvailability;
	}

	public void setQuantityAndAvailability(QuantityAndAvailability2 quantityAndAvailability) {
		this.quantityAndAvailability = quantityAndAvailability;
	}
}