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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTime2Choice;
import com.tools20022.repository.choice.TradeDateCode4Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the trade date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate9Choice#mmDate
 * TradeDate9Choice.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeDate9Choice#mmDateCode
 * TradeDate9Choice.mmDateCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeDate9Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the trade date."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeDate9Choice", propOrder = {"date", "dateCode"})
public class TradeDate9Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DateAndDateTime2Choice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate9Choice
	 * TradeDate9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date expressed as a ISO date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::TRAD, ISO15022Synonym:
	 * :98C::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDate9Choice, DateAndDateTime2Choice> mmDate = new MMMessageAttribute<TradeDate9Choice, DateAndDateTime2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeDate9Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::TRAD"), new ISO15022Synonym(this, ":98C::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date expressed as a ISO date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTime2Choice.mmObject();
		}

		@Override
		public DateAndDateTime2Choice getValue(TradeDate9Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(TradeDate9Choice obj, DateAndDateTime2Choice value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtCd", required = true)
	protected TradeDateCode4Choice dateCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeDateCode4Choice
	 * TradeDateCode4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate9Choice
	 * TradeDate9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A:, ISO15022Synonym: :98C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDate9Choice, TradeDateCode4Choice> mmDateCode = new MMMessageAttribute<TradeDate9Choice, TradeDateCode4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeDate9Choice.mmObject();
			isDerived = false;
			xmlTag = "DtCd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A:"), new ISO15022Synonym(this, ":98C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateCode";
			definition = "Date expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeDateCode4Choice.mmObject();
		}

		@Override
		public TradeDateCode4Choice getValue(TradeDate9Choice obj) {
			return obj.getDateCode();
		}

		@Override
		public void setValue(TradeDate9Choice obj, TradeDateCode4Choice value) {
			obj.setDateCode(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeDate9Choice.mmDate, com.tools20022.repository.choice.TradeDate9Choice.mmDateCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeDate9Choice";
				definition = "Choice of format for the trade date.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTime2Choice getDate() {
		return date;
	}

	public TradeDate9Choice setDate(DateAndDateTime2Choice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public TradeDateCode4Choice getDateCode() {
		return dateCode;
	}

	public TradeDate9Choice setDateCode(TradeDateCode4Choice dateCode) {
		this.dateCode = Objects.requireNonNull(dateCode);
		return this;
	}
}