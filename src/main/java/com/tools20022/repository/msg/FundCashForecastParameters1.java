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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CashForecastMessage1Code;
import com.tools20022.repository.codeset.NoCriteria1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundCashForecastParameters2;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters for which a fund cash forecast report is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#ParametersOrNoCriteria
 * FundCashForecastParameters1.ParametersOrNoCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmCashForecastType
 * FundCashForecastParameters1.mmCashForecastType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmParameters
 * FundCashForecastParameters1.mmParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmNoCriteria
 * FundCashForecastParameters1.mmNoCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashForecastParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for which a fund cash forecast report is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundCashForecastParameters1", propOrder = {"cashForecastType", "parameters", "noCriteria"})
public class FundCashForecastParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshFcstTp", required = true)
	protected CashForecastMessage1Code cashForecastType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshFcstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecastType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifes the fund cash forecast message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashForecastParameters1, CashForecastMessage1Code> mmCashForecastType = new MMMessageAttribute<FundCashForecastParameters1, CashForecastMessage1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "CshFcstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecastType";
			definition = "Specifes the fund cash forecast message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashForecastMessage1Code.mmObject();
		}

		@Override
		public CashForecastMessage1Code getValue(FundCashForecastParameters1 obj) {
			return obj.getCashForecastType();
		}

		@Override
		public void setValue(FundCashForecastParameters1 obj, CashForecastMessage1Code value) {
			obj.setCashForecastType(value);
		}
	};
	@XmlElement(name = "Params", required = true)
	protected FundCashForecastParameters2 parameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters2
	 * FundCashForecastParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Params"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundCashForecastParameters1, FundCashForecastParameters2> mmParameters = new MMMessageAssociationEnd<FundCashForecastParameters1, FundCashForecastParameters2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "Params";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameters";
			definition = "Report parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FundCashForecastParameters2.mmObject();
		}

		@Override
		public FundCashForecastParameters2 getValue(FundCashForecastParameters1 obj) {
			return obj.getParameters();
		}

		@Override
		public void setValue(FundCashForecastParameters1 obj, FundCashForecastParameters2 value) {
			obj.setParameters(value);
		}
	};
	@XmlElement(name = "NoCrit", required = true)
	protected NoCriteria1Code noCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoCriteria1Code
	 * NoCriteria1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific financial instrument or date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundCashForecastParameters1, NoCriteria1Code> mmNoCriteria = new MMMessageAttribute<FundCashForecastParameters1, NoCriteria1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
			isDerived = false;
			xmlTag = "NoCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCriteria";
			definition = "Specifies that there is no criteria for the report. The request is a request for all reports, rather than reports attributed to a specific financial instrument or date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoCriteria1Code.mmObject();
		}

		@Override
		public NoCriteria1Code getValue(FundCashForecastParameters1 obj) {
			return obj.getNoCriteria();
		}

		@Override
		public void setValue(FundCashForecastParameters1 obj, NoCriteria1Code value) {
			obj.setNoCriteria(value);
		}
	};
	/**
	 * Either Parameters or NoCriteria must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1
	 * FundCashForecastParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmParameters
	 * FundCashForecastParameters1.mmParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecastParameters1#mmNoCriteria
	 * FundCashForecastParameters1.mmNoCriteria}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersOrNoCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Parameters or NoCriteria must be present."</li>
	 * </ul>
	 */
	public static final MMXor ParametersOrNoCriteria = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersOrNoCriteria";
			definition = "Either Parameters or NoCriteria must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.FundCashForecastParameters1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.mmParameters, com.tools20022.repository.msg.FundCashForecastParameters1.mmNoCriteria);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.mmCashForecastType, com.tools20022.repository.msg.FundCashForecastParameters1.mmParameters,
						com.tools20022.repository.msg.FundCashForecastParameters1.mmNoCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FundCashForecastParameters1";
				definition = "Parameters for which a fund cash forecast report is requested.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecastParameters1.ParametersOrNoCriteria);
			}
		});
		return mmObject_lazy.get();
	}

	public CashForecastMessage1Code getCashForecastType() {
		return cashForecastType;
	}

	public FundCashForecastParameters1 setCashForecastType(CashForecastMessage1Code cashForecastType) {
		this.cashForecastType = Objects.requireNonNull(cashForecastType);
		return this;
	}

	public FundCashForecastParameters2 getParameters() {
		return parameters;
	}

	public FundCashForecastParameters1 setParameters(FundCashForecastParameters2 parameters) {
		this.parameters = Objects.requireNonNull(parameters);
		return this;
	}

	public NoCriteria1Code getNoCriteria() {
		return noCriteria;
	}

	public FundCashForecastParameters1 setNoCriteria(NoCriteria1Code noCriteria) {
		this.noCriteria = Objects.requireNonNull(noCriteria);
		return this;
	}
}