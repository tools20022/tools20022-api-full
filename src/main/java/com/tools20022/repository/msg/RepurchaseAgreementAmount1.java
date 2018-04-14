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
 * Agreement between two parties to sell a financial instrument or set of
 * financial instruments and repurchase at an agreed later date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1#mmHighlyLiquidDefaultedCounterpartyAmount
 * RepurchaseAgreementAmount1.mmHighlyLiquidDefaultedCounterpartyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1#mmNonHighlyLiquidDefaultedCounterpartyAmount
 * RepurchaseAgreementAmount1.mmNonHighlyLiquidDefaultedCounterpartyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1#mmHighlyLiquidNonDefaultedCounterpartyAmount
 * RepurchaseAgreementAmount1.mmHighlyLiquidNonDefaultedCounterpartyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1#mmNonHighlyLiquidNonDefaultedCounterpartyAmount
 * RepurchaseAgreementAmount1.mmNonHighlyLiquidNonDefaultedCounterpartyAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseAgreementAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RepurchaseAgreementAmount1", propOrder = {"highlyLiquidDefaultedCounterpartyAmount", "nonHighlyLiquidDefaultedCounterpartyAmount", "highlyLiquidNonDefaultedCounterpartyAmount",
		"nonHighlyLiquidNonDefaultedCounterpartyAmount"})
public class RepurchaseAgreementAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HghlyLqdDfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 highlyLiquidDefaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1
	 * RepurchaseAgreementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghlyLqdDfltdCtrPtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlyLiquidDefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false). \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6> mmHighlyLiquidDefaultedCounterpartyAmount = new MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmObject();
			isDerived = false;
			xmlTag = "HghlyLqdDfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyLiquidDefaultedCounterpartyAmount";
			definition = "Current market value (post-haircut) of flows of highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false). \r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(RepurchaseAgreementAmount1 obj) {
			return obj.getHighlyLiquidDefaultedCounterpartyAmount();
		}

		@Override
		public void setValue(RepurchaseAgreementAmount1 obj, AmountAndDirection6 value) {
			obj.setHighlyLiquidDefaultedCounterpartyAmount(value);
		}
	};
	@XmlElement(name = "NonHghlyLqdDfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 nonHighlyLiquidDefaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1
	 * RepurchaseAgreementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonHghlyLqdDfltdCtrPtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonHighlyLiquidDefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6> mmNonHighlyLiquidDefaultedCounterpartyAmount = new MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmObject();
			isDerived = false;
			xmlTag = "NonHghlyLqdDfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonHighlyLiquidDefaultedCounterpartyAmount";
			definition = "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(RepurchaseAgreementAmount1 obj) {
			return obj.getNonHighlyLiquidDefaultedCounterpartyAmount();
		}

		@Override
		public void setValue(RepurchaseAgreementAmount1 obj, AmountAndDirection6 value) {
			obj.setNonHighlyLiquidDefaultedCounterpartyAmount(value);
		}
	};
	@XmlElement(name = "HghlyLqdNonDfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 highlyLiquidNonDefaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1
	 * RepurchaseAgreementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghlyLqdNonDfltdCtrPtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlyLiquidNonDefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties not assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6> mmHighlyLiquidNonDefaultedCounterpartyAmount = new MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmObject();
			isDerived = false;
			xmlTag = "HghlyLqdNonDfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyLiquidNonDefaultedCounterpartyAmount";
			definition = "Current market value (post-haircut) of flows of highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties not assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(RepurchaseAgreementAmount1 obj) {
			return obj.getHighlyLiquidNonDefaultedCounterpartyAmount();
		}

		@Override
		public void setValue(RepurchaseAgreementAmount1 obj, AmountAndDirection6 value) {
			obj.setHighlyLiquidNonDefaultedCounterpartyAmount(value);
		}
	};
	@XmlElement(name = "NonHghlyLqdNonDfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 nonHighlyLiquidNonDefaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1
	 * RepurchaseAgreementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonHghlyLqdNonDfltdCtrPtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonHighlyLiquidNonDefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties not assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6> mmNonHighlyLiquidNonDefaultedCounterpartyAmount = new MMMessageAssociationEnd<RepurchaseAgreementAmount1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmObject();
			isDerived = false;
			xmlTag = "NonHghlyLqdNonDfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonHighlyLiquidNonDefaultedCounterpartyAmount";
			definition = "Current market value (post-haircut) of flows of non-highly liquid marketable financial instruments that are held by the CCP as security through reverse repo against counterparties not assumed to be defaulting under the stress scenario. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(RepurchaseAgreementAmount1 obj) {
			return obj.getNonHighlyLiquidNonDefaultedCounterpartyAmount();
		}

		@Override
		public void setValue(RepurchaseAgreementAmount1 obj, AmountAndDirection6 value) {
			obj.setNonHighlyLiquidNonDefaultedCounterpartyAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmHighlyLiquidDefaultedCounterpartyAmount,
						com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmNonHighlyLiquidDefaultedCounterpartyAmount, com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmHighlyLiquidNonDefaultedCounterpartyAmount,
						com.tools20022.repository.msg.RepurchaseAgreementAmount1.mmNonHighlyLiquidNonDefaultedCounterpartyAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RepurchaseAgreementAmount1";
				definition = "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getHighlyLiquidDefaultedCounterpartyAmount() {
		return highlyLiquidDefaultedCounterpartyAmount;
	}

	public RepurchaseAgreementAmount1 setHighlyLiquidDefaultedCounterpartyAmount(AmountAndDirection6 highlyLiquidDefaultedCounterpartyAmount) {
		this.highlyLiquidDefaultedCounterpartyAmount = Objects.requireNonNull(highlyLiquidDefaultedCounterpartyAmount);
		return this;
	}

	public AmountAndDirection6 getNonHighlyLiquidDefaultedCounterpartyAmount() {
		return nonHighlyLiquidDefaultedCounterpartyAmount;
	}

	public RepurchaseAgreementAmount1 setNonHighlyLiquidDefaultedCounterpartyAmount(AmountAndDirection6 nonHighlyLiquidDefaultedCounterpartyAmount) {
		this.nonHighlyLiquidDefaultedCounterpartyAmount = Objects.requireNonNull(nonHighlyLiquidDefaultedCounterpartyAmount);
		return this;
	}

	public AmountAndDirection6 getHighlyLiquidNonDefaultedCounterpartyAmount() {
		return highlyLiquidNonDefaultedCounterpartyAmount;
	}

	public RepurchaseAgreementAmount1 setHighlyLiquidNonDefaultedCounterpartyAmount(AmountAndDirection6 highlyLiquidNonDefaultedCounterpartyAmount) {
		this.highlyLiquidNonDefaultedCounterpartyAmount = Objects.requireNonNull(highlyLiquidNonDefaultedCounterpartyAmount);
		return this;
	}

	public AmountAndDirection6 getNonHighlyLiquidNonDefaultedCounterpartyAmount() {
		return nonHighlyLiquidNonDefaultedCounterpartyAmount;
	}

	public RepurchaseAgreementAmount1 setNonHighlyLiquidNonDefaultedCounterpartyAmount(AmountAndDirection6 nonHighlyLiquidNonDefaultedCounterpartyAmount) {
		this.nonHighlyLiquidNonDefaultedCounterpartyAmount = Objects.requireNonNull(nonHighlyLiquidNonDefaultedCounterpartyAmount);
		return this;
	}
}