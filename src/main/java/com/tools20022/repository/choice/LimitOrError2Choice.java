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
import com.tools20022.repository.msg.ErrorHandling4;
import com.tools20022.repository.msg.Limit4;
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
 * Choice between risk management limit details or a business error when the
 * requested data cannot be retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LimitOrError2Choice#mmLimit
 * LimitOrError2Choice.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitOrError2Choice#mmBusinessError
 * LimitOrError2Choice.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between risk management limit details or a business error when the requested data cannot be retrieved."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LimitOrError3Choice
 * LimitOrError3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.LimitOrError1Choice
 * LimitOrError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitOrError2Choice", propOrder = {"limit", "businessError"})
public class LimitOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Lmt", required = true)
	protected Limit4 limit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Limit4 Limit4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LimitOrError2Choice
	 * LimitOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitOrError3Choice#mmLimit
	 * LimitOrError3Choice.mmLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.LimitOrError1Choice#mmLimit
	 * LimitOrError1Choice.mmLimit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitOrError2Choice, Limit4> mmLimit = new MMMessageAssociationEnd<LimitOrError2Choice, Limit4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LimitOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "Lmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Requested information on the limit.";
			nextVersions_lazy = () -> Arrays.asList(LimitOrError3Choice.mmLimit);
			previousVersion_lazy = () -> LimitOrError1Choice.mmLimit;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Limit4.mmObject();
		}

		@Override
		public Limit4 getValue(LimitOrError2Choice obj) {
			return obj.getLimit();
		}

		@Override
		public void setValue(LimitOrError2Choice obj, Limit4 value) {
			obj.setLimit(value);
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
	 * {@linkplain com.tools20022.repository.choice.LimitOrError2Choice
	 * LimitOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitOrError3Choice#mmBusinessError
	 * LimitOrError3Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.LimitOrError1Choice#mmBusinessError
	 * LimitOrError1Choice.mmBusinessError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitOrError2Choice, List<ErrorHandling4>> mmBusinessError = new MMMessageAssociationEnd<LimitOrError2Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LimitOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			nextVersions_lazy = () -> Arrays.asList(LimitOrError3Choice.mmBusinessError);
			previousVersion_lazy = () -> LimitOrError1Choice.mmBusinessError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(LimitOrError2Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(LimitOrError2Choice obj, List<ErrorHandling4> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LimitOrError2Choice.mmLimit, com.tools20022.repository.choice.LimitOrError2Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitOrError2Choice";
				definition = "Choice between risk management limit details or a business error when the requested data cannot be retrieved.";
				nextVersions_lazy = () -> Arrays.asList(LimitOrError3Choice.mmObject());
				previousVersion_lazy = () -> LimitOrError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Limit4 getLimit() {
		return limit;
	}

	public LimitOrError2Choice setLimit(Limit4 limit) {
		this.limit = Objects.requireNonNull(limit);
		return this;
	}

	public List<ErrorHandling4> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public LimitOrError2Choice setBusinessError(List<ErrorHandling4> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}