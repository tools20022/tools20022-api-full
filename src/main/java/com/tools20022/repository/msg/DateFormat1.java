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
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.codeset.DateMode1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Format to express a date and a date mode.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DateFormat1#mmDate
 * DateFormat1.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateFormat1#mmDateMode
 * DateFormat1.mmDateMode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateFormat1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Format to express a date and a date mode."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateFormat1", propOrder = {"date", "dateMode"})
public class DateFormat1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DateFormat3Choice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat3Choice
	 * DateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateFormat1 DateFormat1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the event occurs."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateFormat1, DateFormat3Choice> mmDate = new MMMessageAssociationEnd<DateFormat1, DateFormat3Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DateFormat1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date at which the event occurs.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat3Choice.mmObject();
		}

		@Override
		public DateFormat3Choice getValue(DateFormat1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(DateFormat1 obj, DateFormat3Choice value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtMd")
	protected DateMode1Code dateMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DateMode1Code
	 * DateMode1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DateFormat1 DateFormat1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether an event for which a date is provided occurs typically at the \"beginning of day\" or at the \"end of day\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat1, Optional<DateMode1Code>> mmDateMode = new MMMessageAttribute<DateFormat1, Optional<DateMode1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DateFormat1.mmObject();
			isDerived = false;
			xmlTag = "DtMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateMode";
			definition = "Specifies whether an event for which a date is provided occurs typically at the \"beginning of day\" or at the \"end of day\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DateMode1Code.mmObject();
		}

		@Override
		public Optional<DateMode1Code> getValue(DateFormat1 obj) {
			return obj.getDateMode();
		}

		@Override
		public void setValue(DateFormat1 obj, Optional<DateMode1Code> value) {
			obj.setDateMode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateFormat1.mmDate, com.tools20022.repository.msg.DateFormat1.mmDateMode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateFormat1";
				definition = "Format to express a date and a date mode.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat3Choice getDate() {
		return date;
	}

	public DateFormat1 setDate(DateFormat3Choice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Optional<DateMode1Code> getDateMode() {
		return dateMode == null ? Optional.empty() : Optional.of(dateMode);
	}

	public DateFormat1 setDateMode(DateMode1Code dateMode) {
		this.dateMode = dateMode;
		return this;
	}
}