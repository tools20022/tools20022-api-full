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
import com.tools20022.repository.codeset.ExternalRelativeTo1Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Rate information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Percentage1#mmRate
 * Percentage1.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Percentage1#mmRelativeTo
 * Percentage1.mmRelativeTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "Percentage1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rate information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Percentage1", propOrder = {"rate", "relativeTo"})
public class Percentage1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate rate;
	/**
	 * Percentage of an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Percentage1 Percentage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of an amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Percentage1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Percentage of an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ExternalRelativeTo1Code relativeTo;
	/**
	 * Indication of what the percentage is relative to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalRelativeTo1Code
	 * ExternalRelativeTo1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Percentage1 Percentage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltvTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelativeTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of what the percentage is relative to."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelativeTo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Percentage1.mmObject();
			isDerived = false;
			xmlTag = "RltvTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelativeTo";
			definition = "Indication of what the percentage is relative to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalRelativeTo1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Percentage1.mmRate, Percentage1.mmRelativeTo);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Percentage1";
				definition = "Rate information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rate", required = true)
	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	@XmlElement(name = "RltvTo", required = true)
	public ExternalRelativeTo1Code getRelativeTo() {
		return relativeTo;
	}

	public void setRelativeTo(ExternalRelativeTo1Code relativeTo) {
		this.relativeTo = relativeTo;
	}
}