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
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Derivative;
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
 * Liquidity facility that is not characterised by any other liquidity facility
 * provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherLiquidityFacilityAmount1#mmSecuredAmount
 * OtherLiquidityFacilityAmount1.mmSecuredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherLiquidityFacilityAmount1#mmUnsecuredAmount
 * OtherLiquidityFacilityAmount1.mmUnsecuredAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherLiquidityFacilityAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Liquidity facility that is not characterised by any other liquidity facility provided."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherLiquidityFacilityAmount1", propOrder = {"securedAmount", "unsecuredAmount"})
public class OtherLiquidityFacilityAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ScrdAmt", required = true)
	protected AmountAndDirection6 securedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherLiquidityFacilityAmount1
	 * OtherLiquidityFacilityAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total value of any flows of committed secured credit lines, committed repo lines or equivalents with counterparties other than the two defaulting members. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherLiquidityFacilityAmount1, AmountAndDirection6> mmSecuredAmount = new MMMessageAssociationEnd<OtherLiquidityFacilityAmount1, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherLiquidityFacilityAmount1.mmObject();
			isDerived = false;
			xmlTag = "ScrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredAmount";
			definition = "Specifies the total value of any flows of committed secured credit lines, committed repo lines or equivalents with counterparties other than the two defaulting members. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(OtherLiquidityFacilityAmount1 obj) {
			return obj.getSecuredAmount();
		}

		@Override
		public void setValue(OtherLiquidityFacilityAmount1 obj, AmountAndDirection6 value) {
			obj.setSecuredAmount(value);
		}
	};
	@XmlElement(name = "UscrdAmt", required = true)
	protected AmountAndDirection6 unsecuredAmount;
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherLiquidityFacilityAmount1
	 * OtherLiquidityFacilityAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UscrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total value of any flows of unsecured committed credit lines, unsecured committed repo lines or equivalents with counterparties other than the two defaulting members. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherLiquidityFacilityAmount1, AmountAndDirection6> mmUnsecuredAmount = new MMMessageAssociationEnd<OtherLiquidityFacilityAmount1, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherLiquidityFacilityAmount1.mmObject();
			isDerived = false;
			xmlTag = "UscrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredAmount";
			definition = "Specifies the total value of any flows of unsecured committed credit lines, unsecured committed repo lines or equivalents with counterparties other than the two defaulting members. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(OtherLiquidityFacilityAmount1 obj) {
			return obj.getUnsecuredAmount();
		}

		@Override
		public void setValue(OtherLiquidityFacilityAmount1 obj, AmountAndDirection6 value) {
			obj.setUnsecuredAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherLiquidityFacilityAmount1.mmSecuredAmount, com.tools20022.repository.msg.OtherLiquidityFacilityAmount1.mmUnsecuredAmount);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OtherLiquidityFacilityAmount1";
				definition = "Liquidity facility that is not characterised by any other liquidity facility provided.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getSecuredAmount() {
		return securedAmount;
	}

	public OtherLiquidityFacilityAmount1 setSecuredAmount(AmountAndDirection6 securedAmount) {
		this.securedAmount = Objects.requireNonNull(securedAmount);
		return this;
	}

	public AmountAndDirection6 getUnsecuredAmount() {
		return unsecuredAmount;
	}

	public OtherLiquidityFacilityAmount1 setUnsecuredAmount(AmountAndDirection6 unsecuredAmount) {
		this.unsecuredAmount = Objects.requireNonNull(unsecuredAmount);
		return this;
	}
}