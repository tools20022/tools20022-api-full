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
import com.tools20022.repository.codeset.MemoryUnit1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of a hardware memory module.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1#mmIdentification
 * MemoryCharacteristics1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1#mmTotalSize
 * MemoryCharacteristics1.mmTotalSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1#mmFreeSize
 * MemoryCharacteristics1.mmFreeSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemoryCharacteristics1#mmUnit
 * MemoryCharacteristics1.mmUnit}</li>
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
 * "MemoryCharacteristics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of a hardware memory module."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MemoryCharacteristics1", propOrder = {"identification", "totalSize", "freeSize", "unit"})
public class MemoryCharacteristics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Identification or name of the memory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
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
	 * definition} = "Identification or name of the memory."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemoryCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification or name of the memory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DecimalNumber totalSize;
	/**
	 * Total size of the memory unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total size of the memory unit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemoryCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "TtlSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSize";
			definition = "Total size of the memory unit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber freeSize;
	/**
	 * Total size of the available memory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FreeSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total size of the available memory."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFreeSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemoryCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "FreeSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeSize";
			definition = "Total size of the available memory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected MemoryUnit1Code unit;
	/**
	 * Memory unit of the sizes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Memory unit of the sizes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemoryCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Memory unit of the sizes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemoryUnit1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MemoryCharacteristics1.mmIdentification, MemoryCharacteristics1.mmTotalSize, MemoryCharacteristics1.mmFreeSize, MemoryCharacteristics1.mmUnit);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemoryCharacteristics1";
				definition = "Characteristics of a hardware memory module.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "TtlSz", required = true)
	public DecimalNumber getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(DecimalNumber totalSize) {
		this.totalSize = totalSize;
	}

	@XmlElement(name = "FreeSz", required = true)
	public DecimalNumber getFreeSize() {
		return freeSize;
	}

	public void setFreeSize(DecimalNumber freeSize) {
		this.freeSize = freeSize;
	}

	@XmlElement(name = "Unit", required = true)
	public MemoryUnit1Code getUnit() {
		return unit;
	}

	public void setUnit(MemoryUnit1Code unit) {
		this.unit = unit;
	}
}