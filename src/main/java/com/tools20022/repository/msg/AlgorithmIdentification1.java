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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Algorithm1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a cryptographic algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification1#mmAlgorithm
 * AlgorithmIdentification1.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification1#mmParameter
 * AlgorithmIdentification1.mmParameter}</li>
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
 * "AlgorithmIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a cryptographic algorithm."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmIdentification7
 * AlgorithmIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmIdentification8
 * AlgorithmIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmIdentification2
 * AlgorithmIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmIdentification3
 * AlgorithmIdentification3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AlgorithmIdentification1", propOrder = {"algorithm", "parameter"})
public class AlgorithmIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Algorithm1Code algorithm;
	/**
	 * Identification of the algorithm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm1Code
	 * Algorithm1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification1
	 * AlgorithmIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the algorithm."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AlgorithmIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Identification of the algorithm.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm1Code.mmObject();
		}
	};
	protected Parameter1 parameter;
	/**
	 * Parameters associated to the algorithm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Parameter1 Parameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification1
	 * AlgorithmIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Param"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters associated to the algorithm."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParameter = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AlgorithmIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Param";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameter";
			definition = "Parameters associated to the algorithm.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Parameter1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AlgorithmIdentification1.mmAlgorithm, AlgorithmIdentification1.mmParameter);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmIdentification1";
				definition = "Identification of a cryptographic algorithm.";
				nextVersions_lazy = () -> Arrays.asList(AlgorithmIdentification7.mmObject(), AlgorithmIdentification8.mmObject(), AlgorithmIdentification2.mmObject(), AlgorithmIdentification3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Algo", required = true)
	public Algorithm1Code getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Algorithm1Code algorithm) {
		this.algorithm = algorithm;
	}

	@XmlElement(name = "Param")
	public Parameter1 getParameter() {
		return parameter;
	}

	public void setParameter(com.tools20022.repository.msg.Parameter1 parameter) {
		this.parameter = parameter;
	}
}