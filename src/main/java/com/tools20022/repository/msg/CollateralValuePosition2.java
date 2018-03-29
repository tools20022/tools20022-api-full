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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount2;
import com.tools20022.repository.msg.SecurityCharacteristics2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the collateral value position/balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2#mmDataAccessTime
 * CollateralValuePosition2.mmDataAccessTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2#mmTotalCollateralValuation
 * CollateralValuePosition2.mmTotalCollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2#mmSecuritiesAccount
 * CollateralValuePosition2.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2#mmSecurities
 * CollateralValuePosition2.mmSecurities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
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
 * "CollateralValuePosition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the collateral value position/balance."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1
 * CollateralValuePosition1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValuePosition2", propOrder = {"dataAccessTime", "totalCollateralValuation", "securitiesAccount", "securities"})
public class CollateralValuePosition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataAccsTm", required = true)
	protected ISODateTime dataAccessTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2
	 * CollateralValuePosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataAccsTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataAccessTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the data was last accessed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmDataAccessTime
	 * CollateralValuePosition1.mmDataAccessTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuePosition2, ISODateTime> mmDataAccessTime = new MMMessageAttribute<CollateralValuePosition2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuePosition2.mmObject();
			isDerived = false;
			xmlTag = "DataAccsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataAccessTime";
			definition = "Date and time when the data was last accessed.";
			previousVersion_lazy = () -> CollateralValuePosition1.mmDataAccessTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CollateralValuePosition2 obj) {
			return obj.getDataAccessTime();
		}

		@Override
		public void setValue(CollateralValuePosition2 obj, ISODateTime value) {
			obj.setDataAccessTime(value);
		}
	};
	@XmlElement(name = "TtlCollValtn")
	protected ActiveCurrencyAndAmount totalCollateralValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmReportedCurrencyAndAmount
	 * CollateralValuation.mmReportedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2
	 * CollateralValuePosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCollValtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCollateralValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of the collateral valuation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmTotalCollateralValuation
	 * CollateralValuePosition1.mmTotalCollateralValuation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValuePosition2, Optional<ActiveCurrencyAndAmount>> mmTotalCollateralValuation = new MMMessageAttribute<CollateralValuePosition2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmReportedCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuePosition2.mmObject();
			isDerived = false;
			xmlTag = "TtlCollValtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCollateralValuation";
			definition = "Total value of the collateral valuation.";
			previousVersion_lazy = () -> CollateralValuePosition1.mmTotalCollateralValuation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CollateralValuePosition2 obj) {
			return obj.getTotalCollateralValuation();
		}

		@Override
		public void setValue(CollateralValuePosition2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalCollateralValuation(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesAcct")
	protected SecuritiesAccount2 securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount2
	 * SecuritiesAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2
	 * CollateralValuePosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the securities account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmSecuritiesAccount
	 * CollateralValuePosition1.mmSecuritiesAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuePosition2, Optional<SecuritiesAccount2>> mmSecuritiesAccount = new MMMessageAssociationEnd<CollateralValuePosition2, Optional<SecuritiesAccount2>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuePosition2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccount";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the securities account.";
			previousVersion_lazy = () -> CollateralValuePosition1.mmSecuritiesAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount2.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount2> getValue(CollateralValuePosition2 obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(CollateralValuePosition2 obj, Optional<SecuritiesAccount2> value) {
			obj.setSecuritiesAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Scties")
	protected List<SecurityCharacteristics2> securities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCharacteristics2
	 * SecurityCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2
	 * CollateralValuePosition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as known by the account owner, to unambiguously identify the securities on which the collateral value position is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmSecurities
	 * CollateralValuePosition1.mmSecurities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValuePosition2, List<SecurityCharacteristics2>> mmSecurities = new MMMessageAssociationEnd<CollateralValuePosition2, List<SecurityCharacteristics2>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuePosition2.mmObject();
			isDerived = false;
			xmlTag = "Scties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Unique identification, as known by the account owner, to unambiguously identify the securities on which the collateral value position is requested.";
			previousVersion_lazy = () -> CollateralValuePosition1.mmSecurities;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityCharacteristics2.mmObject();
		}

		@Override
		public List<SecurityCharacteristics2> getValue(CollateralValuePosition2 obj) {
			return obj.getSecurities();
		}

		@Override
		public void setValue(CollateralValuePosition2 obj, List<SecurityCharacteristics2> value) {
			obj.setSecurities(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuePosition2.mmDataAccessTime, com.tools20022.repository.msg.CollateralValuePosition2.mmTotalCollateralValuation,
						com.tools20022.repository.msg.CollateralValuePosition2.mmSecuritiesAccount, com.tools20022.repository.msg.CollateralValuePosition2.mmSecurities);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValuePosition2";
				definition = "Details of the collateral value position/balance.";
				previousVersion_lazy = () -> CollateralValuePosition1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDataAccessTime() {
		return dataAccessTime;
	}

	public CollateralValuePosition2 setDataAccessTime(ISODateTime dataAccessTime) {
		this.dataAccessTime = Objects.requireNonNull(dataAccessTime);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalCollateralValuation() {
		return totalCollateralValuation == null ? Optional.empty() : Optional.of(totalCollateralValuation);
	}

	public CollateralValuePosition2 setTotalCollateralValuation(ActiveCurrencyAndAmount totalCollateralValuation) {
		this.totalCollateralValuation = totalCollateralValuation;
		return this;
	}

	public Optional<SecuritiesAccount2> getSecuritiesAccount() {
		return securitiesAccount == null ? Optional.empty() : Optional.of(securitiesAccount);
	}

	public CollateralValuePosition2 setSecuritiesAccount(SecuritiesAccount2 securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
		return this;
	}

	public List<SecurityCharacteristics2> getSecurities() {
		return securities == null ? securities = new ArrayList<>() : securities;
	}

	public CollateralValuePosition2 setSecurities(List<SecurityCharacteristics2> securities) {
		this.securities = Objects.requireNonNull(securities);
		return this;
	}
}