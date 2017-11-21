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
import com.tools20022.repository.msg.GenericIdentification6;
import com.tools20022.repository.msg.QuantityAndAvailability;
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
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantity
 * SubBalanceQuantity1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAsDSS
 * SubBalanceQuantity1Choice.mmQuantityAsDSS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice#mmQuantityAndAvailability
 * SubBalanceQuantity1Choice.mmQuantityAndAvailability}</li>
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
 * "SubBalanceQuantity1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the balance information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubBalanceQuantity1Choice", propOrder = {"quantity", "quantityAsDSS", "quantityAndAvailability"})
public class SubBalanceQuantity1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice
	 * SubBalanceQuantity1Choice}</li>
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
			componentContext_lazy = () -> SubBalanceQuantity1Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected GenericIdentification6 quantityAsDSS;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification6
	 * GenericIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice
	 * SubBalanceQuantity1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAsDSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityAsDSS = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> SubBalanceQuantity1Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyAsDSS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAsDSS";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification6.mmObject();
		}
	};
	protected QuantityAndAvailability quantityAndAvailability;
	/**
	 * Quantity of securities in the sub-balance and whether the balance is
	 * available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAvailability
	 * QuantityAndAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity1Choice
	 * SubBalanceQuantity1Choice}</li>
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
			componentContext_lazy = () -> SubBalanceQuantity1Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyAndAvlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAvailability";
			definition = "Quantity of securities in the sub-balance and whether the balance is available.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAvailability.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubBalanceQuantity1Choice.mmQuantity, SubBalanceQuantity1Choice.mmQuantityAsDSS, SubBalanceQuantity1Choice.mmQuantityAndAvailability);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubBalanceQuantity1Choice";
				definition = "Choice between formats for the balance information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Qty", required = true)
	public FinancialInstrumentQuantityChoice getQuantity() {
		return quantity;
	}

	public void setQuantity(com.tools20022.repository.choice.FinancialInstrumentQuantityChoice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "QtyAsDSS", required = true)
	public GenericIdentification6 getQuantityAsDSS() {
		return quantityAsDSS;
	}

	public void setQuantityAsDSS(GenericIdentification6 quantityAsDSS) {
		this.quantityAsDSS = quantityAsDSS;
	}

	@XmlElement(name = "QtyAndAvlbty", required = true)
	public QuantityAndAvailability getQuantityAndAvailability() {
		return quantityAndAvailability;
	}

	public void setQuantityAndAvailability(QuantityAndAvailability quantityAndAvailability) {
		this.quantityAndAvailability = quantityAndAvailability;
	}
}