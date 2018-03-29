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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuditTrail1;
import com.tools20022.repository.msg.ErrorHandling4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report between the static data audit trail or a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice#mmAuditTrail
 * AuditTrailOrBusinessError2Choice.mmAuditTrail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice#mmBusinessError
 * AuditTrailOrBusinessError2Choice.mmBusinessError}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuditTrailOrBusinessError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Report between the static data audit trail or a business error."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice
 * AuditTrailOrBusinessError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuditTrailOrBusinessError2Choice", propOrder = {"auditTrail", "businessError"})
public class AuditTrailOrBusinessError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AudtTrl", required = true)
	protected List<AuditTrail1> auditTrail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuditTrail1
	 * AuditTrail1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice
	 * AuditTrailOrBusinessError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AudtTrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuditTrail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between data concerning static data audit trail retrieved or business error."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice#mmAuditTrail
	 * AuditTrailOrBusinessError1Choice.mmAuditTrail}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuditTrailOrBusinessError2Choice, List<AuditTrail1>> mmAuditTrail = new MMMessageAssociationEnd<AuditTrailOrBusinessError2Choice, List<AuditTrail1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice.mmObject();
			isDerived = false;
			xmlTag = "AudtTrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuditTrail";
			definition = "Choice between data concerning static data audit trail retrieved or business error.";
			previousVersion_lazy = () -> AuditTrailOrBusinessError1Choice.mmAuditTrail;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrail1.mmObject();
		}

		@Override
		public List<AuditTrail1> getValue(AuditTrailOrBusinessError2Choice obj) {
			return obj.getAuditTrail();
		}

		@Override
		public void setValue(AuditTrailOrBusinessError2Choice obj, List<AuditTrail1> value) {
			obj.setAuditTrail(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<ErrorHandling4> businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice
	 * AuditTrailOrBusinessError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business error resulting from a rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice#mmBusinessError
	 * AuditTrailOrBusinessError1Choice.mmBusinessError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuditTrailOrBusinessError2Choice, List<ErrorHandling4>> mmBusinessError = new MMMessageAssociationEnd<AuditTrailOrBusinessError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Business error resulting from a rejection.";
			previousVersion_lazy = () -> AuditTrailOrBusinessError1Choice.mmBusinessError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(AuditTrailOrBusinessError2Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(AuditTrailOrBusinessError2Choice obj, List<ErrorHandling4> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice.mmAuditTrail, com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AuditTrailOrBusinessError2Choice";
				definition = "Report between the static data audit trail or a business error.";
				previousVersion_lazy = () -> AuditTrailOrBusinessError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AuditTrail1> getAuditTrail() {
		return auditTrail == null ? auditTrail = new ArrayList<>() : auditTrail;
	}

	public AuditTrailOrBusinessError2Choice setAuditTrail(List<AuditTrail1> auditTrail) {
		this.auditTrail = Objects.requireNonNull(auditTrail);
		return this;
	}

	public List<ErrorHandling4> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public AuditTrailOrBusinessError2Choice setBusinessError(List<ErrorHandling4> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}