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
import com.tools20022.repository.area.colr.CollateralAndExposureReportV02;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount1;
import com.tools20022.repository.msg.CollateralValuation2;
import com.tools20022.repository.msg.Summary1;
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
 * Provides for each collateral account the report summary and the valuation of
 * each piece of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral9#mmAccountIdentification
 * Collateral9.mmAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral9#mmReportSummary
 * Collateral9.mmReportSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral9#mmCollateralValuation
 * Collateral9.mmCollateralValuation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmCollateralReport
 * CollateralAndExposureReportV02.mmCollateralReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Collateral9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for each collateral account the report summary and the valuation of each piece of collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral13 Collateral13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Collateral5
 * Collateral5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Collateral9", propOrder = {"accountIdentification", "reportSummary", "collateralValuation"})
public class Collateral9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected CollateralAccount1 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAccount1
	 * CollateralAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral9 Collateral9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the collateral account, that is the identification, the type and optionally the name."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral13#mmAccountIdentification
	 * Collateral13.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral5#mmAccountIdentification
	 * Collateral5.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral9, CollateralAccount1> mmAccountIdentification = new MMMessageAssociationEnd<Collateral9, CollateralAccount1>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral9.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Provides information about the collateral account, that is the identification, the type and optionally the name.";
			nextVersions_lazy = () -> Arrays.asList(Collateral13.mmAccountIdentification);
			previousVersion_lazy = () -> Collateral5.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralAccount1.mmObject();
		}

		@Override
		public CollateralAccount1 getValue(Collateral9 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(Collateral9 obj, CollateralAccount1 value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "RptSummry", required = true)
	protected Summary1 reportSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Summary1 Summary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral9 Collateral9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the summary of the collateral valuation report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral13#mmReportSummary
	 * Collateral13.mmReportSummary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral5#mmReportSummary
	 * Collateral5.mmReportSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral9, Summary1> mmReportSummary = new MMMessageAssociationEnd<Collateral9, Summary1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral9.mmObject();
			isDerived = false;
			xmlTag = "RptSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSummary";
			definition = "Provides the summary of the collateral valuation report.";
			nextVersions_lazy = () -> Arrays.asList(Collateral13.mmReportSummary);
			previousVersion_lazy = () -> Collateral5.mmReportSummary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Summary1.mmObject();
		}

		@Override
		public Summary1 getValue(Collateral9 obj) {
			return obj.getReportSummary();
		}

		@Override
		public void setValue(Collateral9 obj, Summary1 value) {
			obj.setReportSummary(value);
		}
	};
	@XmlElement(name = "CollValtn")
	protected List<CollateralValuation2> collateralValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation2
	 * CollateralValuation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
	 * CollateralManagement.mmCollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral9 Collateral9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollValtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additionnal information about the collateral valuation that has been posted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral13#mmCollateralValuation
	 * Collateral13.mmCollateralValuation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral5#mmCollateralValuationDetails
	 * Collateral5.mmCollateralValuationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral9, List<CollateralValuation2>> mmCollateralValuation = new MMMessageAssociationEnd<Collateral9, List<CollateralValuation2>>() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmCollateralValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral9.mmObject();
			isDerived = false;
			xmlTag = "CollValtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuation";
			definition = "Provides additionnal information about the collateral valuation that has been posted.";
			nextVersions_lazy = () -> Arrays.asList(Collateral13.mmCollateralValuation);
			previousVersion_lazy = () -> Collateral5.mmCollateralValuationDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralValuation2.mmObject();
		}

		@Override
		public List<CollateralValuation2> getValue(Collateral9 obj) {
			return obj.getCollateralValuation();
		}

		@Override
		public void setValue(Collateral9 obj, List<CollateralValuation2> value) {
			obj.setCollateralValuation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral9.mmAccountIdentification, com.tools20022.repository.msg.Collateral9.mmReportSummary,
						com.tools20022.repository.msg.Collateral9.mmCollateralValuation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralAndExposureReportV02.mmCollateralReport);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral9";
				definition = "Provides for each collateral account the report summary and the valuation of each piece of collateral.";
				nextVersions_lazy = () -> Arrays.asList(Collateral13.mmObject());
				previousVersion_lazy = () -> Collateral5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralAccount1 getAccountIdentification() {
		return accountIdentification;
	}

	public Collateral9 setAccountIdentification(CollateralAccount1 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Summary1 getReportSummary() {
		return reportSummary;
	}

	public Collateral9 setReportSummary(Summary1 reportSummary) {
		this.reportSummary = Objects.requireNonNull(reportSummary);
		return this;
	}

	public List<CollateralValuation2> getCollateralValuation() {
		return collateralValuation == null ? collateralValuation = new ArrayList<>() : collateralValuation;
	}

	public Collateral9 setCollateralValuation(List<CollateralValuation2> collateralValuation) {
		this.collateralValuation = Objects.requireNonNull(collateralValuation);
		return this;
	}
}