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
import com.tools20022.repository.area.auth.CCPPortfolioStressTestingResultReportV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification166;
import com.tools20022.repository.msg.PortfolioStressTestResult1;
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
 * Outcome of the application of a hypothetical scenario on the valuation of a
 * set of portfolios of financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioStressTestResult1#mmIdentification
 * ScenarioStressTestResult1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScenarioStressTestResult1#mmPortfolioStressTestResult
 * ScenarioStressTestResult1.mmPortfolioStressTestResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPPortfolioStressTestingResultReportV01#mmScenarioStressTestResult
 * CCPPortfolioStressTestingResultReportV01.mmScenarioStressTestResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ScenarioStressTestResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Outcome of the application of a hypothetical scenario on the valuation of a set of portfolios of financial instruments."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ScenarioStressTestResult1", propOrder = {"identification", "portfolioStressTestResult"})
public class ScenarioStressTestResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification166 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification166
	 * GenericIdentification166}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioStressTestResult1
	 * ScenarioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the stressed account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ScenarioStressTestResult1, GenericIdentification166> mmIdentification = new MMMessageAssociationEnd<ScenarioStressTestResult1, GenericIdentification166>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the stressed account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification166.mmObject();
		}

		@Override
		public GenericIdentification166 getValue(ScenarioStressTestResult1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ScenarioStressTestResult1 obj, GenericIdentification166 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "PrtflStrssTstRslt", required = true)
	protected List<PortfolioStressTestResult1> portfolioStressTestResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PortfolioStressTestResult1
	 * PortfolioStressTestResult1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScenarioStressTestResult1
	 * ScenarioStressTestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflStrssTstRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioStressTestResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result from the application of a stress test scenario to the positions in a cleared portfolio."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ScenarioStressTestResult1, List<PortfolioStressTestResult1>> mmPortfolioStressTestResult = new MMMessageAssociationEnd<ScenarioStressTestResult1, List<PortfolioStressTestResult1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScenarioStressTestResult1.mmObject();
			isDerived = false;
			xmlTag = "PrtflStrssTstRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioStressTestResult";
			definition = "Result from the application of a stress test scenario to the positions in a cleared portfolio.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PortfolioStressTestResult1.mmObject();
		}

		@Override
		public List<PortfolioStressTestResult1> getValue(ScenarioStressTestResult1 obj) {
			return obj.getPortfolioStressTestResult();
		}

		@Override
		public void setValue(ScenarioStressTestResult1 obj, List<PortfolioStressTestResult1> value) {
			obj.setPortfolioStressTestResult(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ScenarioStressTestResult1.mmIdentification, com.tools20022.repository.msg.ScenarioStressTestResult1.mmPortfolioStressTestResult);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPPortfolioStressTestingResultReportV01.mmScenarioStressTestResult);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScenarioStressTestResult1";
				definition = "Outcome of the application of a hypothetical scenario on the valuation of a set of portfolios of financial instruments.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification166 getIdentification() {
		return identification;
	}

	public ScenarioStressTestResult1 setIdentification(GenericIdentification166 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<PortfolioStressTestResult1> getPortfolioStressTestResult() {
		return portfolioStressTestResult == null ? portfolioStressTestResult = new ArrayList<>() : portfolioStressTestResult;
	}

	public ScenarioStressTestResult1 setPortfolioStressTestResult(List<PortfolioStressTestResult1> portfolioStressTestResult) {
		this.portfolioStressTestResult = Objects.requireNonNull(portfolioStressTestResult);
		return this;
	}
}