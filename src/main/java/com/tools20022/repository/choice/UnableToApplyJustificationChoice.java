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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.UnableToApply;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingOrIncorrectInformation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between details of missing information or the complete set of
 * available information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustificationChoice#mmAnyInformation
 * UnableToApplyJustificationChoice.mmAnyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustificationChoice#mmMissingOrIncorrectInformation
 * UnableToApplyJustificationChoice.mmMissingOrIncorrectInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApply#mmJustification
 * UnableToApply.mmJustification}</li>
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
 * "UnableToApplyJustificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between details of missing information or the complete set of available information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnableToApplyJustificationChoice", propOrder = {"anyInformation", "missingOrIncorrectInformation"})
public class UnableToApplyJustificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyInf", required = true)
	protected YesNoIndicator anyInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustificationChoice
	 * UnableToApplyJustificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When set to yes, indicates that all available information about the underlying payment instruction shall be sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnableToApplyJustificationChoice, YesNoIndicator> mmAnyInformation = new MMMessageAttribute<UnableToApplyJustificationChoice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnableToApplyJustificationChoice.mmObject();
			isDerived = false;
			xmlTag = "AnyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyInformation";
			definition = "When set to yes, indicates that all available information about the underlying payment instruction shall be sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(UnableToApplyJustificationChoice obj) {
			return obj.getAnyInformation();
		}

		@Override
		public void setValue(UnableToApplyJustificationChoice obj, YesNoIndicator value) {
			obj.setAnyInformation(value);
		}
	};
	@XmlElement(name = "MssngOrIncrrctInf", required = true)
	protected MissingOrIncorrectInformation missingOrIncorrectInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation
	 * MissingOrIncorrectInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustificationChoice
	 * UnableToApplyJustificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngOrIncrrctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrIncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing or incorrect information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnableToApplyJustificationChoice, MissingOrIncorrectInformation> mmMissingOrIncorrectInformation = new MMMessageAssociationEnd<UnableToApplyJustificationChoice, MissingOrIncorrectInformation>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnableToApplyJustificationChoice.mmObject();
			isDerived = false;
			xmlTag = "MssngOrIncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrIncorrectInformation";
			definition = "Missing or incorrect information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MissingOrIncorrectInformation.mmObject();
		}

		@Override
		public MissingOrIncorrectInformation getValue(UnableToApplyJustificationChoice obj) {
			return obj.getMissingOrIncorrectInformation();
		}

		@Override
		public void setValue(UnableToApplyJustificationChoice obj, MissingOrIncorrectInformation value) {
			obj.setMissingOrIncorrectInformation(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.UnableToApplyJustificationChoice.mmAnyInformation, com.tools20022.repository.choice.UnableToApplyJustificationChoice.mmMissingOrIncorrectInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UnableToApply.mmJustification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyJustificationChoice";
				definition = "Choice between details of missing information or the complete set of available information.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAnyInformation() {
		return anyInformation;
	}

	public UnableToApplyJustificationChoice setAnyInformation(YesNoIndicator anyInformation) {
		this.anyInformation = Objects.requireNonNull(anyInformation);
		return this;
	}

	public MissingOrIncorrectInformation getMissingOrIncorrectInformation() {
		return missingOrIncorrectInformation;
	}

	public UnableToApplyJustificationChoice setMissingOrIncorrectInformation(MissingOrIncorrectInformation missingOrIncorrectInformation) {
		this.missingOrIncorrectInformation = Objects.requireNonNull(missingOrIncorrectInformation);
		return this;
	}
}