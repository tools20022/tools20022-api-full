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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.RegistrationCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SecuritiesCertificate;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to registration of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BasicSecuritiesRegistration"
 * src="doc-files/BasicSecuritiesRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmRegistrationInstruction
 * BasicSecuritiesRegistration.mmRegistrationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationIdentification
 * BasicSecuritiesRegistration.mmCertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationDate
 * BasicSecuritiesRegistration.mmCertificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
 * SecuritiesCertificate.mmBasicRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Registration1Choice
 * Registration1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters1
 * RegistrationParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration2Choice
 * Registration2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters2
 * RegistrationParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason1
 * RegistrationReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason2
 * RegistrationReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration7Choice
 * Registration7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason3
 * RegistrationReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration8Choice
 * Registration8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4
 * RegistrationReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters3
 * RegistrationParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters4
 * RegistrationParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration9Choice
 * Registration9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason5
 * RegistrationReason5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration10Choice
 * Registration10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters5
 * RegistrationParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration12Choice
 * Registration12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Registration11Choice
 * Registration11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason6
 * RegistrationReason6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters6
 * RegistrationParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationParameters7
 * RegistrationParameters7}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BasicSecuritiesRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to registration of securities."</li>
 * </ul>
 */
public class BasicSecuritiesRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which registration information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BasicSecuritiesRegistration, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<BasicSecuritiesRegistration, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which registration information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(BasicSecuritiesRegistration obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};
	protected RegistrationCode registrationInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#mmCode
	 * Registration1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration1Choice#mmProprietary
	 * Registration1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#mmCode
	 * Registration2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration2Choice#mmProprietary
	 * Registration2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#mmCode
	 * Registration3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration3Choice#mmProprietary
	 * Registration3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason1#mmCode
	 * RegistrationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#mmCode
	 * Registration4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration4Choice#mmProprietary
	 * Registration4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason2#mmCode
	 * RegistrationReason2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#mmCode
	 * Registration7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration7Choice#mmProprietary
	 * Registration7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason3#mmCode
	 * RegistrationReason3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#mmCode
	 * Registration8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration8Choice#mmProprietary
	 * Registration8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4#mmCode
	 * RegistrationReason4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#mmCode
	 * Registration6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration6Choice#mmProprietary
	 * Registration6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#mmCode
	 * Registration5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration5Choice#mmProprietary
	 * Registration5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#mmCode
	 * Registration9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice#mmProprietary
	 * Registration9Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason5#mmCode
	 * RegistrationReason5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#mmCode
	 * Registration10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration10Choice#mmProprietary
	 * Registration10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#mmCode
	 * Registration12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration12Choice#mmProprietary
	 * Registration12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#mmCode
	 * Registration11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Registration11Choice#mmProprietary
	 * Registration11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason6#mmCode
	 * RegistrationReason6.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REGT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BasicSecuritiesRegistration, RegistrationCode> mmRegistrationInstruction = new MMBusinessAttribute<BasicSecuritiesRegistration, RegistrationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Registration1Choice.mmCode, Registration1Choice.mmProprietary, Registration2Choice.mmCode, Registration2Choice.mmProprietary, Registration3Choice.mmCode, Registration3Choice.mmProprietary,
					RegistrationReason1.mmCode, Registration4Choice.mmCode, Registration4Choice.mmProprietary, RegistrationReason2.mmCode, Registration7Choice.mmCode, Registration7Choice.mmProprietary, RegistrationReason3.mmCode,
					Registration8Choice.mmCode, Registration8Choice.mmProprietary, RegistrationReason4.mmCode, Registration6Choice.mmCode, Registration6Choice.mmProprietary, Registration5Choice.mmCode, Registration5Choice.mmProprietary,
					Registration9Choice.mmCode, Registration9Choice.mmProprietary, RegistrationReason5.mmCode, Registration10Choice.mmCode, Registration10Choice.mmProprietary, Registration12Choice.mmCode,
					Registration12Choice.mmProprietary, Registration11Choice.mmCode, Registration11Choice.mmProprietary, RegistrationReason6.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REGT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationInstruction";
			definition = "Specifies whether registration should occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationCode.mmObject();
		}

		@Override
		public RegistrationCode getValue(BasicSecuritiesRegistration obj) {
			return obj.getRegistrationInstruction();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, RegistrationCode value) {
			obj.setRegistrationInstruction(value);
		}
	};
	protected Max35Text certificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationIdentification
	 * RegistrationParameters1.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificationIdentification
	 * RegistrationParameters2.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationIdentification
	 * RegistrationParameters3.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationIdentification
	 * RegistrationParameters4.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificationIdentification
	 * RegistrationParameters5.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters6#mmCertificationIdentification
	 * RegistrationParameters6.mmCertificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters7#mmCertificationIdentification
	 * RegistrationParameters7.mmCertificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned to a deposit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BasicSecuritiesRegistration, Max35Text> mmCertificationIdentification = new MMBusinessAttribute<BasicSecuritiesRegistration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(RegistrationParameters1.mmCertificationIdentification, RegistrationParameters2.mmCertificationIdentification, RegistrationParameters3.mmCertificationIdentification,
					RegistrationParameters4.mmCertificationIdentification, RegistrationParameters5.mmCertificationIdentification, RegistrationParameters6.mmCertificationIdentification, RegistrationParameters7.mmCertificationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BasicSecuritiesRegistration obj) {
			return obj.getCertificationIdentification();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, Max35Text value) {
			obj.setCertificationIdentification(value);
		}
	};
	protected ISODateTime certificationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificationDateTime
	 * RegistrationParameters1.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificationDateTime
	 * RegistrationParameters2.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificationDateTime
	 * RegistrationParameters3.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificationDateTime
	 * RegistrationParameters4.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificationDateTime
	 * RegistrationParameters5.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters6#mmCertificationDateTime
	 * RegistrationParameters6.mmCertificationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters7#mmCertificationDateTime
	 * RegistrationParameters7.mmCertificationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the certificates in the deposit were validated by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<BasicSecuritiesRegistration, ISODateTime> mmCertificationDate = new MMBusinessAttribute<BasicSecuritiesRegistration, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(RegistrationParameters1.mmCertificationDateTime, RegistrationParameters2.mmCertificationDateTime, RegistrationParameters3.mmCertificationDateTime,
					RegistrationParameters4.mmCertificationDateTime, RegistrationParameters5.mmCertificationDateTime, RegistrationParameters6.mmCertificationDateTime, RegistrationParameters7.mmCertificationDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationDate";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(BasicSecuritiesRegistration obj) {
			return obj.getCertificationDate();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, ISODateTime value) {
			obj.setCertificationDate(value);
		}
	};
	protected List<SecuritiesCertificate> securitiesCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
	 * SecuritiesCertificate.mmBasicRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmCertificateNumber
	 * RegistrationParameters3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmCertificateNumber
	 * QuantityAndAccount3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmCertificateNumber
	 * QuantityAndAccount8.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmCertificateNumber
	 * QuantityAndAccount4.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmCertificateNumber
	 * QuantityAndAccount9.mmCertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BasicSecuritiesRegistration, List<SecuritiesCertificate>> mmSecuritiesCertificate = new MMBusinessAssociationEnd<BasicSecuritiesRegistration, List<SecuritiesCertificate>>() {
		{
			derivation_lazy = () -> Arrays.asList(RegistrationParameters3.mmCertificateNumber, QuantityAndAccount3.mmCertificateNumber, QuantityAndAccount8.mmCertificateNumber, QuantityAndAccount4.mmCertificateNumber,
					QuantityAndAccount9.mmCertificateNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCertificate";
			definition = "Unique and unambiguous identification of a certificate assigned by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesCertificate.mmBasicRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesCertificate.mmObject();
		}

		@Override
		public List<SecuritiesCertificate> getValue(BasicSecuritiesRegistration obj) {
			return obj.getSecuritiesCertificate();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, List<SecuritiesCertificate> value) {
			obj.setSecuritiesCertificate(value);
		}
	};
	protected DateTimePeriod splitPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
	 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmSplitPeriod
	 * CorporateActionPeriod10.mmSplitPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmSplitPeriod
	 * CorporateActionPeriod14.mmSplitPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a physical certificate can be split."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<BasicSecuritiesRegistration, DateTimePeriod> mmSplitPeriod = new MMBusinessAssociationEnd<BasicSecuritiesRegistration, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod10.mmSplitPeriod, CorporateActionPeriod14.mmSplitPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedSecuritiesRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(BasicSecuritiesRegistration obj) {
			return obj.getSplitPeriod();
		}

		@Override
		public void setValue(BasicSecuritiesRegistration obj, DateTimePeriod value) {
			obj.setSplitPeriod(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BasicSecuritiesRegistration";
				definition = "Information related to registration of securities.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmRegistration, DateTimePeriod.mmRelatedSecuritiesRegistration, SecuritiesCertificate.mmBasicRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmRegistrationInstruction,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationIdentification, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationDate,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecuritiesCertificate, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSplitPeriod);
				derivationComponent_lazy = () -> Arrays.asList(Registration1Choice.mmObject(), RegistrationParameters1.mmObject(), Registration2Choice.mmObject(), RegistrationParameters2.mmObject(), RegistrationReason1.mmObject(),
						RegistrationReason2.mmObject(), Registration7Choice.mmObject(), RegistrationReason3.mmObject(), Registration8Choice.mmObject(), RegistrationReason4.mmObject(), RegistrationParameters3.mmObject(),
						RegistrationParameters4.mmObject(), Registration9Choice.mmObject(), RegistrationReason5.mmObject(), Registration10Choice.mmObject(), RegistrationParameters5.mmObject(), Registration12Choice.mmObject(),
						Registration11Choice.mmObject(), RegistrationReason6.mmObject(), RegistrationParameters6.mmObject(), RegistrationParameters7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BasicSecuritiesRegistration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public BasicSecuritiesRegistration setSecurity(Security security) {
		this.security = security;
		return this;
	}

	public RegistrationCode getRegistrationInstruction() {
		return registrationInstruction;
	}

	public BasicSecuritiesRegistration setRegistrationInstruction(RegistrationCode registrationInstruction) {
		this.registrationInstruction = Objects.requireNonNull(registrationInstruction);
		return this;
	}

	public Max35Text getCertificationIdentification() {
		return certificationIdentification;
	}

	public BasicSecuritiesRegistration setCertificationIdentification(Max35Text certificationIdentification) {
		this.certificationIdentification = Objects.requireNonNull(certificationIdentification);
		return this;
	}

	public ISODateTime getCertificationDate() {
		return certificationDate;
	}

	public BasicSecuritiesRegistration setCertificationDate(ISODateTime certificationDate) {
		this.certificationDate = Objects.requireNonNull(certificationDate);
		return this;
	}

	public List<SecuritiesCertificate> getSecuritiesCertificate() {
		return securitiesCertificate == null ? securitiesCertificate = new ArrayList<>() : securitiesCertificate;
	}

	public BasicSecuritiesRegistration setSecuritiesCertificate(List<SecuritiesCertificate> securitiesCertificate) {
		this.securitiesCertificate = Objects.requireNonNull(securitiesCertificate);
		return this;
	}

	public DateTimePeriod getSplitPeriod() {
		return splitPeriod;
	}

	public BasicSecuritiesRegistration setSplitPeriod(DateTimePeriod splitPeriod) {
		this.splitPeriod = Objects.requireNonNull(splitPeriod);
		return this;
	}
}