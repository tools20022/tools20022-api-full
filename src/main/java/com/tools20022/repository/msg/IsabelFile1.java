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
import com.tools20022.repository.datatype.Max14AlphaNumericText;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max4NumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the parameters for an Isabel payment file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmIdentification
 * IsabelFile1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmOriginator
 * IsabelFile1.mmOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmSize
 * IsabelFile1.mmSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmFormat
 * IsabelFile1.mmFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmFormatVersion
 * IsabelFile1.mmFormatVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile1#mmRecordLength
 * IsabelFile1.mmRecordLength}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelFile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the parameters for an Isabel payment file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IsabelFile1", propOrder = {"identification", "originator", "size", "format", "formatVersion", "recordLength"})
public class IsabelFile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max14AlphaNumericText identification;
	/**
	 * Unique identification of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max14AlphaNumericText
	 * Max14AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the file.\t"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the file.\t";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max14AlphaNumericText.mmObject();
		}
	};
	protected Max14AlphaNumericText originator;
	/**
	 * Unique identification of the originator of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max14AlphaNumericText
	 * Max14AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Originator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the originator of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Unique identification of the originator of the file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max14AlphaNumericText.mmObject();
		}
	};
	protected Number size;
	/**
	 * Size of the file.
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
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Size"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Size of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "Sz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Size";
			definition = "Size of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max16Text format;
	/**
	 * Format of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Format of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max16Text formatVersion;
	/**
	 * Version of the format of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmtVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the format of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormatVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "FrmtVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatVersion";
			definition = "Version of the format of the file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max4NumericText recordLength;
	/**
	 * Length of the individual records in the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4NumericText
	 * Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile1 IsabelFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Length of the individual records in the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelFile1.mmObject();
			isDerived = false;
			xmlTag = "RcrdLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordLength";
			definition = "Length of the individual records in the file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IsabelFile1.mmIdentification, IsabelFile1.mmOriginator, IsabelFile1.mmSize, IsabelFile1.mmFormat, IsabelFile1.mmFormatVersion, IsabelFile1.mmRecordLength);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelFile1";
				definition = "Specifies the parameters for an Isabel payment file.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max14AlphaNumericText getIdentification() {
		return identification;
	}

	public void setIdentification(Max14AlphaNumericText identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Orgtr")
	public Max14AlphaNumericText getOriginator() {
		return originator;
	}

	public void setOriginator(Max14AlphaNumericText originator) {
		this.originator = originator;
	}

	@XmlElement(name = "Sz", required = true)
	public Number getSize() {
		return size;
	}

	public void setSize(Number size) {
		this.size = size;
	}

	@XmlElement(name = "Frmt", required = true)
	public Max16Text getFormat() {
		return format;
	}

	public void setFormat(Max16Text format) {
		this.format = format;
	}

	@XmlElement(name = "FrmtVrsn")
	public Max16Text getFormatVersion() {
		return formatVersion;
	}

	public void setFormatVersion(Max16Text formatVersion) {
		this.formatVersion = formatVersion;
	}

	@XmlElement(name = "RcrdLngth")
	public Max4NumericText getRecordLength() {
		return recordLength;
	}

	public void setRecordLength(Max4NumericText recordLength) {
		this.recordLength = recordLength;
	}
}