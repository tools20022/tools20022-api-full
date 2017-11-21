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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginCallResult2;
import com.tools20022.repository.msg.Result1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to provide the summation of the call amounts for the variation margin
 * and the segregated independent amount, or the segregated independent amount
 * only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmMarginCallResultDetails
 * MarginCallResult2Choice.mmMarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmMarginCallAmount
 * MarginCallResult2Choice.mmMarginCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice#mmSegregatedIndependentAmount
 * MarginCallResult2Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
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
 * "MarginCallResult2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to provide the summation of the call amounts for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCallResult2Choice", propOrder = {"marginCallResultDetails", "marginCallAmount", "segregatedIndependentAmount"})
public class MarginCallResult2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected MarginCallResult2 marginCallResultDetails;
	/**
	 * Provides the summation of the call amounts for the variation margin and
	 * optionaly the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCallResult2
	 * MarginCallResult2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice
	 * MarginCallResult2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRsltDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResultDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and optionaly the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginCallResultDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginCallResult2Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRsltDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResultDetails";
			definition = "Provides the summation of the call amounts for the variation margin and optionaly the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCallResult2.mmObject();
		}
	};
	protected Result1 marginCallAmount;
	/**
	 * Provides the summation of the call amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Result1 Result1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice
	 * MarginCallResult2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the summation of the call amounts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginCallAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> MarginCallResult2Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallAmount";
			definition = "Provides the summation of the call amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Result1.mmObject();
		}
	};
	protected Result1 segregatedIndependentAmount;
	/**
	 * Provides the summation of the call amounts for the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Result1 Result1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
	 * MarginCall.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice
	 * MarginCallResult2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> MarginCallResult2Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Result1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginCallResult2Choice.mmMarginCallResultDetails, MarginCallResult2Choice.mmMarginCallAmount, MarginCallResult2Choice.mmSegregatedIndependentAmount);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResult2Choice";
				definition = "Choice to provide the summation of the call amounts for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MrgnCallRsltDtls", required = true)
	public MarginCallResult2 getMarginCallResultDetails() {
		return marginCallResultDetails;
	}

	public void setMarginCallResultDetails(MarginCallResult2 marginCallResultDetails) {
		this.marginCallResultDetails = marginCallResultDetails;
	}

	@XmlElement(name = "MrgnCallAmt", required = true)
	public Result1 getMarginCallAmount() {
		return marginCallAmount;
	}

	public void setMarginCallAmount(Result1 marginCallAmount) {
		this.marginCallAmount = marginCallAmount;
	}

	@XmlElement(name = "SgrtdIndpdntAmt", required = true)
	public Result1 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(Result1 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}