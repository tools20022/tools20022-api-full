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
import com.tools20022.repository.codeset.UserInterface1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmDestination
 * DisplayCapabilities3.mmDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmAvailableFormat
 * DisplayCapabilities3.mmAvailableFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmNumberOfLines
 * DisplayCapabilities3.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmLineWidth
 * DisplayCapabilities3.mmLineWidth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3#mmAvailableLanguage
 * DisplayCapabilities3.mmAvailableLanguage}</li>
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
 * "DisplayCapabilities3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Capabilities of the display components performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DisplayCapabilities4
 * DisplayCapabilities4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2
 * DisplayCapabilities2}</li>
 * </ul>
 */
public class DisplayCapabilities3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UserInterface1Code destination;
	/**
	 * Destination of the message to present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Destination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Destination of the message to present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmDestination
	 * DisplayCapabilities4.mmDestination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDestination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "Dstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Destination";
			definition = "Destination of the message to present.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmDestination);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface1Code.mmObject();
		}
	};
	protected List<OutputFormat1Code> availableFormat;
	/**
	 * Available message format.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available message format."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmAvailableFormat
	 * DisplayCapabilities4.mmAvailableFormat}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "AvlblFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableFormat";
			definition = "Available message format.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmAvailableFormat);
			minOccurs = 1;
			simpleType_lazy = () -> OutputFormat1Code.mmObject();
		}
	};
	protected Number numberOfLines;
	/**
	 * Number of lines of the display.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmNumberOfLines
	 * DisplayCapabilities4.mmNumberOfLines}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2#mmNumberOfLines
	 * DisplayCapabilities2.mmNumberOfLines}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfLines = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "NbOfLines";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmNumberOfLines);
			previousVersion_lazy = () -> DisplayCapabilities2.mmNumberOfLines;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number lineWidth;
	/**
	 * Number of columns of the display or printer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display or printer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmLineWidth
	 * DisplayCapabilities4.mmLineWidth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities2#mmLineWidth
	 * DisplayCapabilities2.mmLineWidth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineWidth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "LineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display or printer.";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmLineWidth);
			previousVersion_lazy = () -> DisplayCapabilities2.mmLineWidth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<LanguageCode> availableLanguage;
	/**
	 * Available language for the message. Reference ISO 639-1 (alpha-2) et ISO
	 * 639-2 (alpha-3).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities3
	 * DisplayCapabilities3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Available language for the message. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities4#mmAvailableLanguage
	 * DisplayCapabilities4.mmAvailableLanguage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableLanguage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DisplayCapabilities3.mmObject();
			isDerived = false;
			xmlTag = "AvlblLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableLanguage";
			definition = "Available language for the message. Reference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmAvailableLanguage);
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DisplayCapabilities3.mmDestination, DisplayCapabilities3.mmAvailableFormat, DisplayCapabilities3.mmNumberOfLines, DisplayCapabilities3.mmLineWidth,
						DisplayCapabilities3.mmAvailableLanguage);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisplayCapabilities3";
				definition = "Capabilities of the display components performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(DisplayCapabilities4.mmObject());
				previousVersion_lazy = () -> DisplayCapabilities2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public UserInterface1Code getDestination() {
		return destination;
	}

	public void setDestination(UserInterface1Code destination) {
		this.destination = destination;
	}

	public List<OutputFormat1Code> getAvailableFormat() {
		return availableFormat;
	}

	public void setAvailableFormat(List<OutputFormat1Code> availableFormat) {
		this.availableFormat = availableFormat;
	}

	public Number getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(Number numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public Number getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	public List<LanguageCode> getAvailableLanguage() {
		return availableLanguage;
	}

	public void setAvailableLanguage(List<LanguageCode> availableLanguage) {
		this.availableLanguage = availableLanguage;
	}
}