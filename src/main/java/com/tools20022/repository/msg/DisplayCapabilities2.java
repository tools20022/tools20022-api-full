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
import com.tools20022.repository.codeset.UserInterface2Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The capabilities of the display components performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2#mmDisplayType
 * DisplayCapabilities2.mmDisplayType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2#mmNumberOfLines
 * DisplayCapabilities2.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2#mmLineWidth
 * DisplayCapabilities2.mmLineWidth}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisplayCapabilities2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The capabilities of the display components performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayCapabilities3
 * DisplayCapabilities3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1
 * DisplayCapabilities1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisplayCapabilities2", propOrder = {"displayType", "numberOfLines", "lineWidth"})
public class DisplayCapabilities2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DispTp", required = true)
	protected UserInterface2Code displayType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code
	 * UserInterface2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2
	 * DisplayCapabilities2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DispTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of display (for example merchant or cardholder)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmDisplayType
	 * DisplayCapabilities1.mmDisplayType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities2, UserInterface2Code> mmDisplayType = new MMMessageAttribute<DisplayCapabilities2, UserInterface2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "DispTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayType";
			definition = "Type of display (for example merchant or cardholder).";
			previousVersion_lazy = () -> DisplayCapabilities1.mmDisplayType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface2Code.mmObject();
		}

		@Override
		public UserInterface2Code getValue(DisplayCapabilities2 obj) {
			return obj.getDisplayType();
		}

		@Override
		public void setValue(DisplayCapabilities2 obj, UserInterface2Code value) {
			obj.setDisplayType(value);
		}
	};
	@XmlElement(name = "NbOfLines", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2
	 * DisplayCapabilities2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfLines"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmNumberOfLines
	 * DisplayCapabilities3.mmNumberOfLines}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmNumberOfLines
	 * DisplayCapabilities1.mmNumberOfLines}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities2, Number> mmNumberOfLines = new MMMessageAttribute<DisplayCapabilities2, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "NbOfLines";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities3.mmNumberOfLines);
			previousVersion_lazy = () -> DisplayCapabilities1.mmNumberOfLines;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(DisplayCapabilities2 obj) {
			return obj.getNumberOfLines();
		}

		@Override
		public void setValue(DisplayCapabilities2 obj, Number value) {
			obj.setNumberOfLines(value);
		}
	};
	@XmlElement(name = "LineWidth", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2
	 * DisplayCapabilities2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineWidth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmLineWidth
	 * DisplayCapabilities3.mmLineWidth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmLineWidth
	 * DisplayCapabilities1.mmLineWidth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DisplayCapabilities2, Number> mmLineWidth = new MMMessageAttribute<DisplayCapabilities2, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities2.mmObject();
			isDerived = false;
			xmlTag = "LineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities3.mmLineWidth);
			previousVersion_lazy = () -> DisplayCapabilities1.mmLineWidth;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(DisplayCapabilities2 obj) {
			return obj.getLineWidth();
		}

		@Override
		public void setValue(DisplayCapabilities2 obj, Number value) {
			obj.setLineWidth(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisplayCapabilities2.mmDisplayType, com.tools20022.repository.msg.DisplayCapabilities2.mmNumberOfLines,
						com.tools20022.repository.msg.DisplayCapabilities2.mmLineWidth);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisplayCapabilities2";
				definition = "The capabilities of the display components performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities3.mmObject());
				previousVersion_lazy = () -> DisplayCapabilities1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public UserInterface2Code getDisplayType() {
		return displayType;
	}

	public DisplayCapabilities2 setDisplayType(UserInterface2Code displayType) {
		this.displayType = Objects.requireNonNull(displayType);
		return this;
	}

	public Number getNumberOfLines() {
		return numberOfLines;
	}

	public DisplayCapabilities2 setNumberOfLines(Number numberOfLines) {
		this.numberOfLines = Objects.requireNonNull(numberOfLines);
		return this;
	}

	public Number getLineWidth() {
		return lineWidth;
	}

	public DisplayCapabilities2 setLineWidth(Number lineWidth) {
		this.lineWidth = Objects.requireNonNull(lineWidth);
		return this;
	}
}