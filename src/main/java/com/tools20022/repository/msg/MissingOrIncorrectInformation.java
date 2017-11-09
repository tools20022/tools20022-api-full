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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code;
import com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Indicates the reason for the UnableToApply. It can be missing and/or
 * incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation#mmMissingInformation
 * MissingOrIncorrectInformation.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation#mmIncorrectInformation
 * MissingOrIncorrectInformation.mmIncorrectInformation}</li>
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
 * "MissingOrIncorrectInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the reason for the UnableToApply. It can be missing and/or incorrect information."
 * </li>
 * </ul>
 */
public class MissingOrIncorrectInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<UnableToApplyMissingInfo1Code> missingInformation;
	/**
	 * Indicates the missing information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation
	 * MissingOrIncorrectInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the missing information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMissingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MissingOrIncorrectInformation.mmObject();
			isDerived = false;
			xmlTag = "MssngInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Indicates the missing information.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
		}
	};
	protected List<UnableToApplyIncorrectInfo1Code> incorrectInformation;
	/**
	 * Indicates the incorrect information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation
	 * MissingOrIncorrectInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrrctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the incorrect information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncorrectInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MissingOrIncorrectInformation.mmObject();
			isDerived = false;
			xmlTag = "IncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInformation";
			definition = "Indicates the incorrect information.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> UnableToApplyIncorrectInfo1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MissingOrIncorrectInformation.mmMissingInformation, MissingOrIncorrectInformation.mmIncorrectInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MissingOrIncorrectInformation";
				definition = "Indicates the reason for the UnableToApply. It can be missing and/or incorrect information.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<UnableToApplyMissingInfo1Code> getMissingInformation() {
		return missingInformation;
	}

	public void setMissingInformation(List<UnableToApplyMissingInfo1Code> missingInformation) {
		this.missingInformation = missingInformation;
	}

	public List<UnableToApplyIncorrectInfo1Code> getIncorrectInformation() {
		return incorrectInformation;
	}

	public void setIncorrectInformation(List<UnableToApplyIncorrectInfo1Code> incorrectInformation) {
		this.incorrectInformation = incorrectInformation;
	}
}