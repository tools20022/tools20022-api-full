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
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice number format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Number22Choice#mmShort
 * Number22Choice.mmShort}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Number22Choice#mmLong
 * Number22Choice.mmLong}</li>
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
 * "Number22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice number format."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Number2Choice Number2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Number22Choice", propOrder = {"short", "long"})
public class Number22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText short_;
	/**
	 * Number of maximum 3 numeric text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Number22Choice
	 * Number22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Shrt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Short"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of maximum 3 numeric text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Number2Choice#mmShort
	 * Number2Choice.mmShort}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShort = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Number22Choice.mmObject();
			isDerived = false;
			xmlTag = "Shrt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Short";
			definition = "Number of maximum 3 numeric text.";
			previousVersion_lazy = () -> Number2Choice.mmShort;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected GenericIdentification1 long_;
	/**
	 * Number of maximum 35 text, with the possibility to provide an issuer for
	 * the number identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Number22Choice
	 * Number22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Long"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of maximum 35 text, with the possibility to provide an issuer for the number identification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Number2Choice#mmLong
	 * Number2Choice.mmLong}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLong = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Number22Choice.mmObject();
			isDerived = false;
			xmlTag = "Lng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Long";
			definition = "Number of maximum 35 text, with the possibility to provide an issuer for the number identification.";
			previousVersion_lazy = () -> Number2Choice.mmLong;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Number22Choice.mmShort, Number22Choice.mmLong);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Number22Choice";
				definition = "Choice number format.";
				previousVersion_lazy = () -> Number2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Shrt", required = true)
	public Exact3NumericText getShort() {
		return short_;
	}

	public void setShort(Exact3NumericText short_) {
		this.short_ = short_;
	}

	@XmlElement(name = "Lng", required = true)
	public GenericIdentification1 getLong() {
		return long_;
	}

	public void setLong(GenericIdentification1 long_) {
		this.long_ = long_;
	}
}