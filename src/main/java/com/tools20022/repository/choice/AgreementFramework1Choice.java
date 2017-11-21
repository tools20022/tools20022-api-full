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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AgreementFramework1Code;
import com.tools20022.repository.entity.MasterAgreement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a code or a proprietary code for the underlying master
 * agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice#mmAgreementFramework
 * AgreementFramework1Choice.mmAgreementFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice#mmProprietaryIdentification
 * AgreementFramework1Choice.mmProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MasterAgreement
 * MasterAgreement}</li>
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
 * "AgreementFramework1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a code or a proprietary code for  the underlying master agreement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgreementFramework1Choice", propOrder = {"agreementFramework", "proprietaryIdentification"})
public class AgreementFramework1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AgreementFramework1Code agreementFramework;
	/**
	 * Code to specify the type of collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFramework1Code
	 * AgreementFramework1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmMasterAgreementType
	 * MasterAgreement.mmMasterAgreementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice
	 * AgreementFramework1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code to specify the type of collateral agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreementFramework = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MasterAgreement.mmMasterAgreementType;
			componentContext_lazy = () -> AgreementFramework1Choice.mmObject();
			isDerived = false;
			xmlTag = "AgrmtFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementFramework";
			definition = "Code to specify the type of collateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AgreementFramework1Code.mmObject();
		}
	};
	protected GenericIdentification30 proprietaryIdentification;
	/**
	 * Proprietary identification to specify the type of collateral agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmMasterAgreementType
	 * MasterAgreement.mmMasterAgreementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AgreementFramework1Choice
	 * AgreementFramework1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification to specify the type of collateral agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MasterAgreement.mmMasterAgreementType;
			componentContext_lazy = () -> AgreementFramework1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Proprietary identification to specify the type of collateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AgreementFramework1Choice.mmAgreementFramework, AgreementFramework1Choice.mmProprietaryIdentification);
				trace_lazy = () -> MasterAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreementFramework1Choice";
				definition = "Choice between a code or a proprietary code for  the underlying master agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AgrmtFrmwk", required = true)
	public AgreementFramework1Code getAgreementFramework() {
		return agreementFramework;
	}

	public void setAgreementFramework(AgreementFramework1Code agreementFramework) {
		this.agreementFramework = agreementFramework;
	}

	@XmlElement(name = "PrtryId", required = true)
	public GenericIdentification30 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification30 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}
}