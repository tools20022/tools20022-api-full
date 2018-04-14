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
import com.tools20022.repository.codeset.TR34Command1Code;
import com.tools20022.repository.datatype.Max100KBinary;
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
 * Data block for a TR31 or TR34 key block which contains the key being
 * transported.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TRRelatedData1#mmTR34Command
 * TRRelatedData1.mmTR34Command}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TRRelatedData1#mmTRBlock
 * TRRelatedData1.mmTRBlock}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TRRelatedData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data block for a TR31 or TR34 key block which contains the key being transported."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TRRelatedData2 TRRelatedData2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TRRelatedData1", propOrder = {"tR34Command", "tRBlock"})
public class TRRelatedData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TR34Cmd")
	protected TR34Command1Code tR34Command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Command1Code
	 * TR34Command1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TRRelatedData1 TRRelatedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TR34Cmd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR34Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific TR34 command where the TRBlock is a TR34 block."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TRRelatedData2#mmTR34Command
	 * TRRelatedData2.mmTR34Command}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TRRelatedData1, Optional<TR34Command1Code>> mmTR34Command = new MMMessageAttribute<TRRelatedData1, Optional<TR34Command1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TRRelatedData1.mmObject();
			isDerived = false;
			xmlTag = "TR34Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR34Command";
			definition = "Specific TR34 command where the TRBlock is a TR34 block.";
			nextVersions_lazy = () -> Arrays.asList(TRRelatedData2.mmTR34Command);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TR34Command1Code.mmObject();
		}

		@Override
		public Optional<TR34Command1Code> getValue(TRRelatedData1 obj) {
			return obj.getTR34Command();
		}

		@Override
		public void setValue(TRRelatedData1 obj, Optional<TR34Command1Code> value) {
			obj.setTR34Command(value.orElse(null));
		}
	};
	@XmlElement(name = "TRBlck", required = true)
	protected Max100KBinary tRBlock;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TRRelatedData1 TRRelatedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TRBlck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TRBlock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TR31 or TR34 data block."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TRRelatedData2#mmTRBlock
	 * TRRelatedData2.mmTRBlock}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TRRelatedData1, Max100KBinary> mmTRBlock = new MMMessageAttribute<TRRelatedData1, Max100KBinary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TRRelatedData1.mmObject();
			isDerived = false;
			xmlTag = "TRBlck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TRBlock";
			definition = "TR31 or TR34 data block.";
			nextVersions_lazy = () -> Arrays.asList(TRRelatedData2.mmTRBlock);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Max100KBinary getValue(TRRelatedData1 obj) {
			return obj.getTRBlock();
		}

		@Override
		public void setValue(TRRelatedData1 obj, Max100KBinary value) {
			obj.setTRBlock(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TRRelatedData1.mmTR34Command, com.tools20022.repository.msg.TRRelatedData1.mmTRBlock);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TRRelatedData1";
				definition = "Data block for a TR31 or TR34 key block which contains the key being transported.";
				nextVersions_lazy = () -> Arrays.asList(TRRelatedData2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TR34Command1Code> getTR34Command() {
		return tR34Command == null ? Optional.empty() : Optional.of(tR34Command);
	}

	public TRRelatedData1 setTR34Command(TR34Command1Code tR34Command) {
		this.tR34Command = tR34Command;
		return this;
	}

	public Max100KBinary getTRBlock() {
		return tRBlock;
	}

	public TRRelatedData1 setTRBlock(Max100KBinary tRBlock) {
		this.tRBlock = Objects.requireNonNull(tRBlock);
		return this;
	}
}