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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateCodeAndTimeFormat3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an ISODate or ISODateTime format or a date code or a date code
 * and a time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DateFormat44Choice#mmDate
 * DateFormat44Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat44Choice#mmDateCodeAndTime
 * DateFormat44Choice.mmDateCodeAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat44Choice#mmDateCode
 * DateFormat44Choice.mmDateCode}</li>
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
 * "DateFormat44Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between an ISODate or ISODateTime format or a date code or a date code and a time."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DateFormat32Choice
 * DateFormat32Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateFormat44Choice", propOrder = {"date", "dateCodeAndTime", "dateCode"})
public class DateFormat44Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DateAndDateTime2Choice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat44Choice
	 * DateFormat44Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::4!c//8!n</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date expressed as a calendar date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat32Choice#mmDate
	 * DateFormat32Choice.mmDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat44Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::4!c//8!n"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date expressed as a calendar date.";
			previousVersion_lazy = () -> DateFormat32Choice.mmDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DateAndDateTime2Choice.mmObject();
		}
	};
	@XmlElement(name = "DtCdAndTm", required = true)
	protected DateCodeAndTimeFormat3 dateCodeAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateCodeAndTimeFormat3
	 * DateCodeAndTimeFormat3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat44Choice
	 * DateFormat44Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtCdAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateCodeAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a date code and a time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat32Choice#mmDateCodeAndTime
	 * DateFormat32Choice.mmDateCodeAndTime}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateCodeAndTime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat44Choice.mmObject();
			isDerived = false;
			xmlTag = "DtCdAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateCodeAndTime";
			definition = "Specifies a date code and a time.";
			previousVersion_lazy = () -> DateFormat32Choice.mmDateCodeAndTime;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateCodeAndTimeFormat3.mmObject();
		}
	};
	@XmlElement(name = "DtCd", required = true)
	protected DateCode19Choice dateCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateCode19Choice
	 * DateCode19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat44Choice
	 * DateFormat44Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98B::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat32Choice#mmDateCode
	 * DateFormat32Choice.mmDateCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateCode = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat44Choice.mmObject();
			isDerived = false;
			xmlTag = "DtCd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98B::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateCode";
			definition = "Specifies the type of date.";
			previousVersion_lazy = () -> DateFormat32Choice.mmDateCode;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DateCode19Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateFormat44Choice.mmDate, com.tools20022.repository.choice.DateFormat44Choice.mmDateCodeAndTime,
						com.tools20022.repository.choice.DateFormat44Choice.mmDateCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateFormat44Choice";
				definition = "Choice between an ISODate or ISODateTime format or a date code or a date code and a time.";
				previousVersion_lazy = () -> DateFormat32Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTime2Choice getDate() {
		return date;
	}

	public DateFormat44Choice setDate(com.tools20022.repository.choice.DateAndDateTime2Choice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public DateCodeAndTimeFormat3 getDateCodeAndTime() {
		return dateCodeAndTime;
	}

	public DateFormat44Choice setDateCodeAndTime(DateCodeAndTimeFormat3 dateCodeAndTime) {
		this.dateCodeAndTime = Objects.requireNonNull(dateCodeAndTime);
		return this;
	}

	public DateCode19Choice getDateCode() {
		return dateCode;
	}

	public DateFormat44Choice setDateCode(com.tools20022.repository.choice.DateCode19Choice dateCode) {
		this.dateCode = Objects.requireNonNull(dateCode);
		return this;
	}
}