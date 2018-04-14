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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Liquidity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characterisation of a financial instrument purchased by a central
 * counterparty using clearing member assets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1#mmHighlyLiquidAmount
 * InvestmentInstrumentAmount1.mmHighlyLiquidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1#mmNonHighlyLiquidAmount
 * InvestmentInstrumentAmount1.mmNonHighlyLiquidAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentInstrumentAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characterisation of a financial instrument purchased by a central counterparty using clearing member assets."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentInstrumentAmount1", propOrder = {"highlyLiquidAmount", "nonHighlyLiquidAmount"})
public class InvestmentInstrumentAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HghlyLqdAmt", required = true)
	protected AmountAndDirection6 highlyLiquidAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmValue
	 * Liquidity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1
	 * InvestmentInstrumentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghlyLqdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlyLiquidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of highly liquid marketable financial instruments. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentInstrumentAmount1, AmountAndDirection6> mmHighlyLiquidAmount = new MMMessageAssociationEnd<InvestmentInstrumentAmount1, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentInstrumentAmount1.mmObject();
			isDerived = false;
			xmlTag = "HghlyLqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyLiquidAmount";
			definition = "Current market value (post-haircut) of flows of highly liquid marketable financial instruments. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(InvestmentInstrumentAmount1 obj) {
			return obj.getHighlyLiquidAmount();
		}

		@Override
		public void setValue(InvestmentInstrumentAmount1 obj, AmountAndDirection6 value) {
			obj.setHighlyLiquidAmount(value);
		}
	};
	@XmlElement(name = "NonHghlyLqdAmt", required = true)
	protected AmountAndDirection6 nonHighlyLiquidAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmValue
	 * Liquidity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1
	 * InvestmentInstrumentAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonHghlyLqdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonHighlyLiquidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentInstrumentAmount1, AmountAndDirection6> mmNonHighlyLiquidAmount = new MMMessageAssociationEnd<InvestmentInstrumentAmount1, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentInstrumentAmount1.mmObject();
			isDerived = false;
			xmlTag = "NonHghlyLqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonHighlyLiquidAmount";
			definition = "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(InvestmentInstrumentAmount1 obj) {
			return obj.getNonHighlyLiquidAmount();
		}

		@Override
		public void setValue(InvestmentInstrumentAmount1 obj, AmountAndDirection6 value) {
			obj.setNonHighlyLiquidAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentInstrumentAmount1.mmHighlyLiquidAmount, com.tools20022.repository.msg.InvestmentInstrumentAmount1.mmNonHighlyLiquidAmount);
				trace_lazy = () -> Liquidity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentInstrumentAmount1";
				definition = "Characterisation of a financial instrument purchased by a central counterparty using clearing member assets.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getHighlyLiquidAmount() {
		return highlyLiquidAmount;
	}

	public InvestmentInstrumentAmount1 setHighlyLiquidAmount(AmountAndDirection6 highlyLiquidAmount) {
		this.highlyLiquidAmount = Objects.requireNonNull(highlyLiquidAmount);
		return this;
	}

	public AmountAndDirection6 getNonHighlyLiquidAmount() {
		return nonHighlyLiquidAmount;
	}

	public InvestmentInstrumentAmount1 setNonHighlyLiquidAmount(AmountAndDirection6 nonHighlyLiquidAmount) {
		this.nonHighlyLiquidAmount = Objects.requireNonNull(nonHighlyLiquidAmount);
		return this;
	}
}