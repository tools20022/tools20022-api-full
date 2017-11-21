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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingOrIncorrectInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification1Choice#mmAnyInformation
 * UnableToApplyJustification1Choice.mmAnyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification1Choice#mmMissingOrIncorrectInformation
 * UnableToApplyJustification1Choice.mmMissingOrIncorrectInformation}</li>
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
 * "UnableToApplyJustification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between details of missing information or the complete set of available information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnableToApplyJustification1Choice", propOrder = {"anyInformation", "missingOrIncorrectInformation"})
public class UnableToApplyJustification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator anyInformation;
	/**
	 * When set to yes, indicates that all available information about the
	 * underlying payment instruction shall be sent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification1Choice
	 * UnableToApplyJustification1Choice}</li>
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
	public static final MMMessageAttribute mmAnyInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnableToApplyJustification1Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyInformation";
			definition = "When set to yes, indicates that all available information about the underlying payment instruction shall be sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MissingOrIncorrectInformation1 missingOrIncorrectInformation;
	/**
	 * Missing or incorrect information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation1
	 * MissingOrIncorrectInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification1Choice
	 * UnableToApplyJustification1Choice}</li>
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
	public static final MMMessageAssociationEnd mmMissingOrIncorrectInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnableToApplyJustification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MssngOrIncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrIncorrectInformation";
			definition = "Missing or incorrect information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MissingOrIncorrectInformation1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnableToApplyJustification1Choice.mmAnyInformation, UnableToApplyJustification1Choice.mmMissingOrIncorrectInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnableToApplyJustification1Choice";
				definition = "Choice between details of missing information or the complete set of available information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AnyInf", required = true)
	public YesNoIndicator getAnyInformation() {
		return anyInformation;
	}

	public void setAnyInformation(YesNoIndicator anyInformation) {
		this.anyInformation = anyInformation;
	}

	@XmlElement(name = "MssngOrIncrrctInf", required = true)
	public MissingOrIncorrectInformation1 getMissingOrIncorrectInformation() {
		return missingOrIncorrectInformation;
	}

	public void setMissingOrIncorrectInformation(MissingOrIncorrectInformation1 missingOrIncorrectInformation) {
		this.missingOrIncorrectInformation = missingOrIncorrectInformation;
	}
}