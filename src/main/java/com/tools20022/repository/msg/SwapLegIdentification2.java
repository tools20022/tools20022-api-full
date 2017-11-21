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
import com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Swaps;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the legs of swap transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapIn
 * SwapLegIdentification2.mmSwapIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapOut
 * SwapLegIdentification2.mmSwapOut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
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
 * "SwapLegIdentification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the legs of swap transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SwapLegIdentification2", propOrder = {"swapIn", "swapOut"})
public class SwapLegIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentIdentification7Choice swapIn;
	/**
	 * Instrument received by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
	 * FinancialInstrumentIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2
	 * SwapLegIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwpIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument received by the buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwapIn = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> SwapLegIdentification2.mmObject();
			isDerived = false;
			xmlTag = "SwpIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapIn";
			definition = "Instrument received by the buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentIdentification7Choice.mmObject();
		}
	};
	protected FinancialInstrumentIdentification7Choice swapOut;
	/**
	 * Instrument paid by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
	 * FinancialInstrumentIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2
	 * SwapLegIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwpOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument paid by the buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwapOut = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> SwapLegIdentification2.mmObject();
			isDerived = false;
			xmlTag = "SwpOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapOut";
			definition = "Instrument paid by the buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentIdentification7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SwapLegIdentification2.mmSwapIn, SwapLegIdentification2.mmSwapOut);
				trace_lazy = () -> Swaps.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwapLegIdentification2";
				definition = "Details of the legs of swap transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SwpIn")
	public FinancialInstrumentIdentification7Choice getSwapIn() {
		return swapIn;
	}

	public void setSwapIn(FinancialInstrumentIdentification7Choice swapIn) {
		this.swapIn = swapIn;
	}

	@XmlElement(name = "SwpOut")
	public FinancialInstrumentIdentification7Choice getSwapOut() {
		return swapOut;
	}

	public void setSwapOut(FinancialInstrumentIdentification7Choice swapOut) {
		this.swapOut = swapOut;
	}
}