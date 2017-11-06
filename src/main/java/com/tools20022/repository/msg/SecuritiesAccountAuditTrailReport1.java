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
import com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice;
import com.tools20022.repository.choice.DateSearchChoice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Report information about securities account reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1#mmSecuritiesAccountAuditTrailOrError
 * SecuritiesAccountAuditTrailReport1.mmSecuritiesAccountAuditTrailOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1#mmDatePeriod
 * SecuritiesAccountAuditTrailReport1.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1#mmSecuritiesAccountIdentification
 * SecuritiesAccountAuditTrailReport1.mmSecuritiesAccountIdentification}</li>
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
 * "SecuritiesAccountAuditTrailReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report information about securities account reference data."</li>
 * </ul>
 */
public class SecuritiesAccountAuditTrailReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuditTrailOrBusinessError1Choice securitiesAccountAuditTrailOrError;
	/**
	 * Identifies the returned securities account reference data or error
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError1Choice
	 * AuditTrailOrBusinessError1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1
	 * SecuritiesAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctAudtTrlOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountAuditTrailOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the returned securities account reference data or error information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesAccountAuditTrailOrError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctAudtTrlOrErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountAuditTrailOrError";
			definition = "Identifies the returned securities account reference data or error information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrailOrBusinessError1Choice.mmObject();
		}
	};
	protected DateSearchChoice datePeriod;
	/**
	 * Period in dates for which the audit trail is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1
	 * SecuritiesAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period in dates for which the audit trail is provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Period in dates for which the audit trail is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected SecuritiesAccount13 securitiesAccountIdentification;
	/**
	 * Identifies the securities account for which the audit trail is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1
	 * SecuritiesAccountAuditTrailReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities account for which the audit trail is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesAccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccountAuditTrailReport1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "Identifies the securities account for which the audit trail is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1.mmSecuritiesAccountAuditTrailOrError, com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1.mmDatePeriod,
						com.tools20022.repository.msg.SecuritiesAccountAuditTrailReport1.mmSecuritiesAccountIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountAuditTrailReport1";
				definition = "Report information about securities account reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public AuditTrailOrBusinessError1Choice getSecuritiesAccountAuditTrailOrError() {
		return securitiesAccountAuditTrailOrError;
	}

	public void setSecuritiesAccountAuditTrailOrError(AuditTrailOrBusinessError1Choice securitiesAccountAuditTrailOrError) {
		this.securitiesAccountAuditTrailOrError = securitiesAccountAuditTrailOrError;
	}

	public DateSearchChoice getDatePeriod() {
		return datePeriod;
	}

	public void setDatePeriod(DateSearchChoice datePeriod) {
		this.datePeriod = datePeriod;
	}

	public SecuritiesAccount13 getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification;
	}

	public void setSecuritiesAccountIdentification(com.tools20022.repository.msg.SecuritiesAccount13 securitiesAccountIdentification) {
		this.securitiesAccountIdentification = securitiesAccountIdentification;
	}
}