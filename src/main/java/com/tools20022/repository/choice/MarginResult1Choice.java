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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CollateralMovement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the margin result.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice#mmExcessAmount
 * MarginResult1Choice.mmExcessAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice#mmDeficitAmount
 * MarginResult1Choice.mmDeficitAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralMovement
 * CollateralMovement}</li>
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
 * "MarginResult1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the margin result."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginResult1Choice", propOrder = {"excessAmount", "deficitAmount"})
public class MarginResult1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XcssAmt", required = true)
	protected ActiveCurrencyAndAmount excessAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice
	 * MarginResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Excess amount that the central counterparty may restitute to the Clearing member."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginResult1Choice, ActiveCurrencyAndAmount> mmExcessAmount = new MMMessageAttribute<MarginResult1Choice, ActiveCurrencyAndAmount>() {
		{
			businessComponentTrace_lazy = () -> CollateralMovement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "XcssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessAmount";
			definition = "Excess amount that the central counterparty may restitute to the Clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(MarginResult1Choice obj) {
			return obj.getExcessAmount();
		}

		@Override
		public void setValue(MarginResult1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setExcessAmount(value);
		}
	};
	@XmlElement(name = "DfcitAmt", required = true)
	protected ActiveCurrencyAndAmount deficitAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginResult1Choice
	 * MarginResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfcitAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeficitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deficit amount that the central counterparty will provide to the clearing member."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginResult1Choice, ActiveCurrencyAndAmount> mmDeficitAmount = new MMMessageAttribute<MarginResult1Choice, ActiveCurrencyAndAmount>() {
		{
			businessComponentTrace_lazy = () -> CollateralMovement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "DfcitAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeficitAmount";
			definition = "Deficit amount that the central counterparty will provide to the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(MarginResult1Choice obj) {
			return obj.getDeficitAmount();
		}

		@Override
		public void setValue(MarginResult1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setDeficitAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginResult1Choice.mmExcessAmount, com.tools20022.repository.choice.MarginResult1Choice.mmDeficitAmount);
				trace_lazy = () -> CollateralMovement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginResult1Choice";
				definition = "Provides details on the margin result.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getExcessAmount() {
		return excessAmount;
	}

	public MarginResult1Choice setExcessAmount(ActiveCurrencyAndAmount excessAmount) {
		this.excessAmount = Objects.requireNonNull(excessAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getDeficitAmount() {
		return deficitAmount;
	}

	public MarginResult1Choice setDeficitAmount(ActiveCurrencyAndAmount deficitAmount) {
		this.deficitAmount = Objects.requireNonNull(deficitAmount);
		return this;
	}
}