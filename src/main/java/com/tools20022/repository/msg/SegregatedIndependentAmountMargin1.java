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
import com.tools20022.repository.codeset.RoundingMethod1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.IndependentAmountTerm;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Elements used to calculate the collateral margin call for the segregated
 * independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmMinimumTransferAmount
 * SegregatedIndependentAmountMargin1.mmMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingAmount
 * SegregatedIndependentAmountMargin1.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingMethod
 * SegregatedIndependentAmountMargin1.mmRoundingMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IndependentAmountTerm
 * IndependentAmountTerm}</li>
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
 * "SegregatedIndependentAmountMargin1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Elements used to calculate the collateral margin call for the segregated independent amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SegregatedIndependentAmountMargin1", propOrder = {"minimumTransferAmount", "roundingAmount", "roundingMethod"})
public class SegregatedIndependentAmountMargin1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount minimumTransferAmount;
	/**
	 * Minimum amount to pay/receive as specified in the agreement in the base
	 * currency (to avoid the need to transfer an inconveniently small amount of
	 * segregated independent amount).
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
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumTransferAmount
	 * ExposureTerm.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
	 * SegregatedIndependentAmountMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTrfAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of segregated independent amount)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTransferAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumTransferAmount;
			componentContext_lazy = () -> SegregatedIndependentAmountMargin1.mmObject();
			isDerived = false;
			xmlTag = "MinTrfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of segregated independent amount).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount roundingAmount;
	/**
	 * Amount specified to avoid the need to transfer uneven amounts of
	 * independent amount collateral.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingAmount
	 * ExposureTerm.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
	 * SegregatedIndependentAmountMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified to avoid the need to transfer uneven amounts of independent amount collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingAmount;
			componentContext_lazy = () -> SegregatedIndependentAmountMargin1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of independent amount collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected RoundingMethod1Code roundingMethod;
	/**
	 * Defines how the rounding amount was applied in the calculation. For
	 * example, should the amount of collateral required be rounded up, down, to
	 * the closer integral multiple specified or not rounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingMethod
	 * ExposureTerm.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
	 * SegregatedIndependentAmountMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingMethod;
			componentContext_lazy = () -> SegregatedIndependentAmountMargin1.mmObject();
			isDerived = false;
			xmlTag = "RndgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingMethod1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SegregatedIndependentAmountMargin1.mmMinimumTransferAmount, SegregatedIndependentAmountMargin1.mmRoundingAmount, SegregatedIndependentAmountMargin1.mmRoundingMethod);
				trace_lazy = () -> IndependentAmountTerm.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SegregatedIndependentAmountMargin1";
				definition = "Elements used to calculate the collateral margin call for the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MinTrfAmt", required = true)
	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return minimumTransferAmount;
	}

	public void setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = minimumTransferAmount;
	}

	@XmlElement(name = "RndgAmt")
	public ActiveCurrencyAndAmount getRoundingAmount() {
		return roundingAmount;
	}

	public void setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	@XmlElement(name = "RndgMtd")
	public RoundingMethod1Code getRoundingMethod() {
		return roundingMethod;
	}

	public void setRoundingMethod(RoundingMethod1Code roundingMethod) {
		this.roundingMethod = roundingMethod;
	}
}