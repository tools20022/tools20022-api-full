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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesStatementQueryV04;
import com.tools20022.repository.choice.Reason12Choice;
import com.tools20022.repository.choice.Status8Choice;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional specific query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#mmStatus
 * AdditionalQueryParameters7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#mmReason
 * AdditionalQueryParameters7.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#mmFinancialInstrumentIdentification
 * AdditionalQueryParameters7.mmFinancialInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04#mmAdditionalQueryParameters
 * SecuritiesStatementQueryV04.mmAdditionalQueryParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalQueryParameters7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional specific query criteria."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9
 * AdditionalQueryParameters9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5
 * AdditionalQueryParameters5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalQueryParameters7", propOrder = {"status", "reason", "financialInstrumentIdentification"})
public class AdditionalQueryParameters7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts")
	protected Status8Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Status8Choice
	 * Status8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7
	 * AdditionalQueryParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to obtain a Securities Transaction Pending Report for transactions with the specified status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#mmStatus
	 * AdditionalQueryParameters9.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#mmStatus
	 * AdditionalQueryParameters5.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalQueryParameters7, Optional<Status8Choice>> mmStatus = new MMMessageAssociationEnd<AdditionalQueryParameters7, Optional<Status8Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalQueryParameters7.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Request to obtain a Securities Transaction Pending Report for transactions with the specified status.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalQueryParameters9.mmStatus);
			previousVersion_lazy = () -> AdditionalQueryParameters5.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Status8Choice.mmObject();
		}

		@Override
		public Optional<Status8Choice> getValue(AdditionalQueryParameters7 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(AdditionalQueryParameters7 obj, Optional<Status8Choice> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected List<Reason12Choice> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Reason12Choice
	 * Reason12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7
	 * AdditionalQueryParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request to obtain a Securities Transaction Pending Report for transactions with the specified status reason."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#mmReason
	 * AdditionalQueryParameters9.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#mmReason
	 * AdditionalQueryParameters5.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalQueryParameters7, List<Reason12Choice>> mmReason = new MMMessageAssociationEnd<AdditionalQueryParameters7, List<Reason12Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalQueryParameters7.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Request to obtain a Securities Transaction Pending Report for transactions with the specified status reason.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalQueryParameters9.mmReason);
			previousVersion_lazy = () -> AdditionalQueryParameters5.mmReason;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Reason12Choice.mmObject();
		}

		@Override
		public List<Reason12Choice> getValue(AdditionalQueryParameters7 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(AdditionalQueryParameters7 obj, List<Reason12Choice> value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification14> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7
	 * AdditionalQueryParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#mmFinancialInstrumentIdentification
	 * AdditionalQueryParameters9.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#mmFinancialInstrumentIdentification
	 * AdditionalQueryParameters5.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AdditionalQueryParameters7, List<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<AdditionalQueryParameters7, List<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalQueryParameters7.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalQueryParameters9.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> AdditionalQueryParameters5.mmFinancialInstrumentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public List<SecurityIdentification14> getValue(AdditionalQueryParameters7 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(AdditionalQueryParameters7 obj, List<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalQueryParameters7.mmStatus, com.tools20022.repository.msg.AdditionalQueryParameters7.mmReason,
						com.tools20022.repository.msg.AdditionalQueryParameters7.mmFinancialInstrumentIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesStatementQueryV04.mmAdditionalQueryParameters);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalQueryParameters7";
				definition = "Additional specific query criteria.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalQueryParameters9.mmObject());
				previousVersion_lazy = () -> AdditionalQueryParameters5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Status8Choice> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public AdditionalQueryParameters7 setStatus(Status8Choice status) {
		this.status = status;
		return this;
	}

	public List<Reason12Choice> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public AdditionalQueryParameters7 setReason(List<Reason12Choice> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public List<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public AdditionalQueryParameters7 setFinancialInstrumentIdentification(List<SecurityIdentification14> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}
}