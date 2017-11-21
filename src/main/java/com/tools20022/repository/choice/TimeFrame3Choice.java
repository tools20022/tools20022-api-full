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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between TimeFrame elements that define a period as number of days
 * before an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice#mmTradeMinus
 * TimeFrame3Choice.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice#mmRenunciationMinus
 * TimeFrame3Choice.mmRenunciationMinus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeFrame3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between TimeFrame elements that define a period as number of days before an activity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TimeFrame3Choice", propOrder = {"tradeMinus", "renunciationMinus"})
public class TimeFrame3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Number tradeMinus;
	/**
	 * An agreed number of days before the Trade date (T) used to define
	 * standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition
	 * 
	 * Where = T is the date that the price is applied to a transaction,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
	 * TimeFrame.mmTradeMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice
	 * TimeFrame3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction,"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeMinus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmTradeMinus;
			componentContext_lazy = () -> TimeFrame3Choice.mmObject();
			isDerived = false;
			xmlTag = "TMns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number renunciationMinus;
	/**
	 * An agreed number of days before the Renunciation of Title documents are
	 * received used to define standard timeframes in redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationMinus
	 * TimeFrame.mmRenunciationMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice
	 * TimeFrame3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRenunciationMinus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmRenunciationMinus;
			componentContext_lazy = () -> TimeFrame3Choice.mmObject();
			isDerived = false;
			xmlTag = "RMns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TimeFrame3Choice.mmTradeMinus, TimeFrame3Choice.mmRenunciationMinus);
				trace_lazy = () -> TimeFrame.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TimeFrame3Choice";
				definition = "Choice between TimeFrame elements that define a period as number of days before an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TMns", required = true)
	public Number getTradeMinus() {
		return tradeMinus;
	}

	public void setTradeMinus(Number tradeMinus) {
		this.tradeMinus = tradeMinus;
	}

	@XmlElement(name = "RMns", required = true)
	public Number getRenunciationMinus() {
		return renunciationMinus;
	}

	public void setRenunciationMinus(Number renunciationMinus) {
		this.renunciationMinus = renunciationMinus;
	}
}