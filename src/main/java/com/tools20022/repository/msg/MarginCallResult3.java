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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.MarginCallRequestV03;
import com.tools20022.repository.area.colr.MarginCallRequestV04;
import com.tools20022.repository.choice.MarginCallResult2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.DefaultFundContribution;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the summation of the call amounts per margin type and optionaly the
 * default fund amount (only for CCP).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult3#mmDefaultFundAmount
 * MarginCallResult3.mmDefaultFundAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCallResult3#mmMarginCallResult
 * MarginCallResult3.mmMarginCallResult}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginCallResult
 * MarginCallRequestV03.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallResult
 * MarginCallRequestV04.mmMarginCallResult}</li>
 * </ul>
 * </li>
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
 * "MarginCallResult3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the summation of the call amounts per margin type and optionaly the default fund amount (only for CCP)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCallResult3", propOrder = {"defaultFundAmount", "marginCallResult"})
public class MarginCallResult3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount defaultFundAmount;
	/**
	 * Specifies the total amount required by the clearing member to participate
	 * to the default fund.
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
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmExcessOrDeficitAmount
	 * DefaultFundContribution.mmExcessOrDeficitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltFndAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount required by the clearing member to participate to the default fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultFundAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DefaultFundContribution.mmExcessOrDeficitAmount;
			componentContext_lazy = () -> MarginCallResult3.mmObject();
			isDerived = false;
			xmlTag = "DfltFndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundAmount";
			definition = "Specifies the total amount required by the clearing member to participate to the default fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected MarginCallResult2Choice marginCallResult;
	/**
	 * Provides the summation of the call amounts for the variation margin and
	 * the segregated independent amount or the segregated independent amount
	 * only or the total margin call amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult2Choice
	 * MarginCallResult2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and the segregated independent amount or the segregated independent amount only or the total margin call amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginCallResult = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> MarginCallResult3.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Provides the summation of the call amounts for the variation margin and the segregated independent amount or the segregated independent amount only or the total margin call amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCallResult2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginCallResult3.mmDefaultFundAmount, MarginCallResult3.mmMarginCallResult);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV03.mmMarginCallResult, MarginCallRequestV04.mmMarginCallResult);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResult3";
				definition = "Provides the summation of the call amounts per margin type and optionaly the default fund amount (only for CCP).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DfltFndAmt")
	public ActiveCurrencyAndAmount getDefaultFundAmount() {
		return defaultFundAmount;
	}

	public void setDefaultFundAmount(ActiveCurrencyAndAmount defaultFundAmount) {
		this.defaultFundAmount = defaultFundAmount;
	}

	@XmlElement(name = "MrgnCallRslt", required = true)
	public MarginCallResult2Choice getMarginCallResult() {
		return marginCallResult;
	}

	public void setMarginCallResult(MarginCallResult2Choice marginCallResult) {
		this.marginCallResult = marginCallResult;
	}
}