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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.OutputFormat1Code;
import com.tools20022.repository.codeset.UserInterface5Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Capabilities of the display components performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5#mmDestination
 * DisplayCapabilities5.mmDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5#mmAvailableFormat
 * DisplayCapabilities5.mmAvailableFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5#mmNumberOfLines
 * DisplayCapabilities5.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5#mmLineWidth
 * DisplayCapabilities5.mmLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5#mmAvailableLanguage
 * DisplayCapabilities5.mmAvailableLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisplayCapabilities5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Capabilities of the display components performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4
 * DisplayCapabilities4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisplayCapabilities5", propOrder = {"destination", "availableFormat", "numberOfLines", "lineWidth", "availableLanguage"})
public class DisplayCapabilities5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dstn", required = true)
	protected List<UserInterface5Code> destination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code
	 * UserInterface5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Destination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Destination of the message to present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmDestination
	 * DisplayCapabilities4.mmDestination}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities5, List<UserInterface5Code>> mmDestination = new MMMessageAttribute<DisplayCapabilities5, List<UserInterface5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "Dstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Destination";
			definition = "Destination of the message to present.";
			previousVersion_lazy = () -> DisplayCapabilities4.mmDestination;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface5Code.mmObject();
		}

		@Override
		public List<UserInterface5Code> getValue(DisplayCapabilities5 obj) {
			return obj.getDestination();
		}

		@Override
		public void setValue(DisplayCapabilities5 obj, List<UserInterface5Code> value) {
			obj.setDestination(value);
		}
	};
	@XmlElement(name = "AvlblFrmt")
	protected List<OutputFormat1Code> availableFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat1Code
	 * OutputFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblFrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available message format."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmAvailableFormat
	 * DisplayCapabilities4.mmAvailableFormat}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities5, List<OutputFormat1Code>> mmAvailableFormat = new MMMessageAttribute<DisplayCapabilities5, List<OutputFormat1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "AvlblFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableFormat";
			definition = "Available message format.";
			previousVersion_lazy = () -> DisplayCapabilities4.mmAvailableFormat;
			minOccurs = 0;
			simpleType_lazy = () -> OutputFormat1Code.mmObject();
		}

		@Override
		public List<OutputFormat1Code> getValue(DisplayCapabilities5 obj) {
			return obj.getAvailableFormat();
		}

		@Override
		public void setValue(DisplayCapabilities5 obj, List<OutputFormat1Code> value) {
			obj.setAvailableFormat(value);
		}
	};
	@XmlElement(name = "NbOfLines")
	protected Number numberOfLines;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfLines"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmNumberOfLines
	 * DisplayCapabilities4.mmNumberOfLines}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities5, Optional<Number>> mmNumberOfLines = new MMMessageAttribute<DisplayCapabilities5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "NbOfLines";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display.";
			previousVersion_lazy = () -> DisplayCapabilities4.mmNumberOfLines;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DisplayCapabilities5 obj) {
			return obj.getNumberOfLines();
		}

		@Override
		public void setValue(DisplayCapabilities5 obj, Optional<Number> value) {
			obj.setNumberOfLines(value.orElse(null));
		}
	};
	@XmlElement(name = "LineWidth")
	protected Number lineWidth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineWidth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display or printer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmLineWidth
	 * DisplayCapabilities4.mmLineWidth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities5, Optional<Number>> mmLineWidth = new MMMessageAttribute<DisplayCapabilities5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "LineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display or printer.";
			previousVersion_lazy = () -> DisplayCapabilities4.mmLineWidth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DisplayCapabilities5 obj) {
			return obj.getLineWidth();
		}

		@Override
		public void setValue(DisplayCapabilities5 obj, Optional<Number> value) {
			obj.setLineWidth(value.orElse(null));
		}
	};
	@XmlElement(name = "AvlblLang")
	protected List<LanguageCode> availableLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities5
	 * DisplayCapabilities5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblLang"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Available language for the message. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmAvailableLanguage
	 * DisplayCapabilities4.mmAvailableLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities5, List<LanguageCode>> mmAvailableLanguage = new MMMessageAttribute<DisplayCapabilities5, List<LanguageCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities5.mmObject();
			isDerived = false;
			xmlTag = "AvlblLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableLanguage";
			definition = "Available language for the message. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			previousVersion_lazy = () -> DisplayCapabilities4.mmAvailableLanguage;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public List<LanguageCode> getValue(DisplayCapabilities5 obj) {
			return obj.getAvailableLanguage();
		}

		@Override
		public void setValue(DisplayCapabilities5 obj, List<LanguageCode> value) {
			obj.setAvailableLanguage(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisplayCapabilities5.mmDestination, com.tools20022.repository.msg.DisplayCapabilities5.mmAvailableFormat,
						com.tools20022.repository.msg.DisplayCapabilities5.mmNumberOfLines, com.tools20022.repository.msg.DisplayCapabilities5.mmLineWidth, com.tools20022.repository.msg.DisplayCapabilities5.mmAvailableLanguage);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisplayCapabilities5";
				definition = "Capabilities of the display components performing the transaction.";
				previousVersion_lazy = () -> DisplayCapabilities4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<UserInterface5Code> getDestination() {
		return destination == null ? destination = new ArrayList<>() : destination;
	}

	public DisplayCapabilities5 setDestination(List<UserInterface5Code> destination) {
		this.destination = Objects.requireNonNull(destination);
		return this;
	}

	public List<OutputFormat1Code> getAvailableFormat() {
		return availableFormat == null ? availableFormat = new ArrayList<>() : availableFormat;
	}

	public DisplayCapabilities5 setAvailableFormat(List<OutputFormat1Code> availableFormat) {
		this.availableFormat = Objects.requireNonNull(availableFormat);
		return this;
	}

	public Optional<Number> getNumberOfLines() {
		return numberOfLines == null ? Optional.empty() : Optional.of(numberOfLines);
	}

	public DisplayCapabilities5 setNumberOfLines(Number numberOfLines) {
		this.numberOfLines = numberOfLines;
		return this;
	}

	public Optional<Number> getLineWidth() {
		return lineWidth == null ? Optional.empty() : Optional.of(lineWidth);
	}

	public DisplayCapabilities5 setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public List<LanguageCode> getAvailableLanguage() {
		return availableLanguage == null ? availableLanguage = new ArrayList<>() : availableLanguage;
	}

	public DisplayCapabilities5 setAvailableLanguage(List<LanguageCode> availableLanguage) {
		this.availableLanguage = Objects.requireNonNull(availableLanguage);
		return this;
	}
}