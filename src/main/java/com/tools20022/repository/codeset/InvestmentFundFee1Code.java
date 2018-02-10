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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.InvestmentFundFee1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of service for which a fee e is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#BackEndLoad
 * InvestmentFundFee1Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#BrokerageFee
 * InvestmentFundFee1Code.BrokerageFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#Commission
 * InvestmentFundFee1Code.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#CommissionDePlacement
 * InvestmentFundFee1Code.CommissionDePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#ContingentDeferredSalesCharge
 * InvestmentFundFee1Code.ContingentDeferredSalesCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#CorrespondentBankCharge
 * InvestmentFundFee1Code.CorrespondentBankCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#DilutionLevy
 * InvestmentFundFee1Code.DilutionLevy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#FrontEndLoad
 * InvestmentFundFee1Code.FrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#InitialCharge
 * InvestmentFundFee1Code.InitialCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#AdditionalFee
 * InvestmentFundFee1Code.AdditionalFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#PostageCharge
 * InvestmentFundFee1Code.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#Premium
 * InvestmentFundFee1Code.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#ServiceProvisionFee
 * InvestmentFundFee1Code.ServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#ShippingCharge
 * InvestmentFundFee1Code.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#Switch
 * InvestmentFundFee1Code.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#UCITSCommission
 * InvestmentFundFee1Code.UCITSCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#RegulatoryFee
 * InvestmentFundFee1Code.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code#Penalty
 * InvestmentFundFee1Code.Penalty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFeeCode
 * InvestmentFundFeeCode}</li>
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
 * "InvestmentFundFee1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of service for which a fee e is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundFee1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code BackEndLoad = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageFee"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code BrokerageFee = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageFee";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.BrokerageFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code Commission = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDePlacement"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code CommissionDePlacement = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDePlacement";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.CommissionDePlacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingentDeferredSalesCharge"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code ContingentDeferredSalesCharge = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingentDeferredSalesCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.ContingentDeferredSalesCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharge"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code CorrespondentBankCharge = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.CorrespondentBankCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DilutionLevy"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code DilutionLevy = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DilutionLevy";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.DilutionLevy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code FrontEndLoad = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialCharge"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code InitialCharge = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.InitialCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalFee"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code AdditionalFee = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFee";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.AdditionalFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code PostageCharge = new InvestmentFundFee1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.PostageCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code Premium = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code ServiceProvisionFee = new InvestmentFundFee1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.ServiceProvisionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code ShippingCharge = new InvestmentFundFee1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.ShippingCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code Switch = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSCommission"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code UCITSCommission = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITSCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.UCITSCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::REGF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code RegulatoryFee = new InvestmentFundFee1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.RegulatoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundFee1Code
	 * InvestmentFundFee1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * </ul>
	 */
	public static final InvestmentFundFee1Code Penalty = new InvestmentFundFee1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Penalty";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundFee1Code.mmObject();
			codeName = InvestmentFundFeeCode.Penalty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundFee1Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundFee1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundFee1Code";
				definition = "Specifies the type of service for which a fee e is asked or paid.";
				trace_lazy = () -> InvestmentFundFeeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundFee1Code.BackEndLoad, com.tools20022.repository.codeset.InvestmentFundFee1Code.BrokerageFee,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.Commission, com.tools20022.repository.codeset.InvestmentFundFee1Code.CommissionDePlacement,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.ContingentDeferredSalesCharge, com.tools20022.repository.codeset.InvestmentFundFee1Code.CorrespondentBankCharge,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.DilutionLevy, com.tools20022.repository.codeset.InvestmentFundFee1Code.FrontEndLoad, com.tools20022.repository.codeset.InvestmentFundFee1Code.InitialCharge,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.AdditionalFee, com.tools20022.repository.codeset.InvestmentFundFee1Code.PostageCharge, com.tools20022.repository.codeset.InvestmentFundFee1Code.Premium,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.ServiceProvisionFee, com.tools20022.repository.codeset.InvestmentFundFee1Code.ShippingCharge, com.tools20022.repository.codeset.InvestmentFundFee1Code.Switch,
						com.tools20022.repository.codeset.InvestmentFundFee1Code.UCITSCommission, com.tools20022.repository.codeset.InvestmentFundFee1Code.RegulatoryFee, com.tools20022.repository.codeset.InvestmentFundFee1Code.Penalty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(BrokerageFee.getCodeName().get(), BrokerageFee);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(CommissionDePlacement.getCodeName().get(), CommissionDePlacement);
		codesByName.put(ContingentDeferredSalesCharge.getCodeName().get(), ContingentDeferredSalesCharge);
		codesByName.put(CorrespondentBankCharge.getCodeName().get(), CorrespondentBankCharge);
		codesByName.put(DilutionLevy.getCodeName().get(), DilutionLevy);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(InitialCharge.getCodeName().get(), InitialCharge);
		codesByName.put(AdditionalFee.getCodeName().get(), AdditionalFee);
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(UCITSCommission.getCodeName().get(), UCITSCommission);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(Penalty.getCodeName().get(), Penalty);
	}

	public static InvestmentFundFee1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundFee1Code[] values() {
		InvestmentFundFee1Code[] values = new InvestmentFundFee1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundFee1Code> {
		@Override
		public InvestmentFundFee1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundFee1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}