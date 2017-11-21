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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the securities movement resulting from the
 * election instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmSecurityIdentification
 * CorporateActionSecuritiesMovement2.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmPostingDateTime
 * CorporateActionSecuritiesMovement2.mmPostingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmPostingIdentification
 * CorporateActionSecuritiesMovement2.mmPostingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmPostingQuantity
 * CorporateActionSecuritiesMovement2.mmPostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmAccountDetails
 * CorporateActionSecuritiesMovement2.mmAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
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
 * "CorporateActionSecuritiesMovement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the securities movement resulting from the election instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionSecuritiesMovement2", propOrder = {"securityIdentification", "postingDateTime", "postingIdentification", "postingQuantity", "accountDetails"})
public class CorporateActionSecuritiesMovement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification7 securityIdentification;
	/**
	 * Identification of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected DateAndDateTimeChoice postingDateTime;
	/**
	 * Date and time of the posting of the movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingDateTime
	 * CorporateActionDistribution.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the posting of the movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingDateTime;
			componentContext_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
			isDerived = false;
			xmlTag = "PstngDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDateTime";
			definition = "Date and time of the posting of the movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Max35Text postingIdentification;
	/**
	 * Posting identification of the securities movement.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Posting identification of the securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
			isDerived = false;
			xmlTag = "PstngId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingIdentification";
			definition = "Posting identification of the securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice postingQuantity;
	/**
	 * Securities quantity posted as a result of the securities movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
	 * CorporateActionDistribution.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities quantity posted as a result of the securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingQuantity;
			componentContext_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
			isDerived = false;
			xmlTag = "PstngQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingQuantity";
			definition = "Securities quantity posted as a result of the securities movement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesAccount9> accountDetails;
	/**
	 * Provides information about the account which is debited/credited as a
	 * result of the movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount9
	 * SecuritiesAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the account which is debited/credited as a result of the movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmAccount;
			componentContext_lazy = () -> CorporateActionSecuritiesMovement2.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account which is debited/credited as a result of the movement.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionSecuritiesMovement2.mmSecurityIdentification, CorporateActionSecuritiesMovement2.mmPostingDateTime, CorporateActionSecuritiesMovement2.mmPostingIdentification,
						CorporateActionSecuritiesMovement2.mmPostingQuantity, CorporateActionSecuritiesMovement2.mmAccountDetails);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionSecuritiesMovement2";
				definition = "Provides information about the securities movement resulting from the election instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctyId", required = true)
	public SecurityIdentification7 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification7 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "PstngDtTm")
	public DateAndDateTimeChoice getPostingDateTime() {
		return postingDateTime;
	}

	public void setPostingDateTime(DateAndDateTimeChoice postingDateTime) {
		this.postingDateTime = postingDateTime;
	}

	@XmlElement(name = "PstngId")
	public Max35Text getPostingIdentification() {
		return postingIdentification;
	}

	public void setPostingIdentification(Max35Text postingIdentification) {
		this.postingIdentification = postingIdentification;
	}

	@XmlElement(name = "PstngQty", required = true)
	public UnitOrFaceAmount1Choice getPostingQuantity() {
		return postingQuantity;
	}

	public void setPostingQuantity(UnitOrFaceAmount1Choice postingQuantity) {
		this.postingQuantity = postingQuantity;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public List<SecuritiesAccount9> getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(List<com.tools20022.repository.msg.SecuritiesAccount9> accountDetails) {
		this.accountDetails = accountDetails;
	}
}