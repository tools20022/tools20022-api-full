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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ChargeType13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies charges linked to the type of service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#BackEndLoad
 * ChargeType13Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#FrontEndLoad
 * ChargeType13Code.FrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType13Code#Switch
 * ChargeType13Code.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#DilutionLevy
 * ChargeType13Code.DilutionLevy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType13Code#Discount
 * ChargeType13Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType13Code#Penalty
 * ChargeType13Code.Penalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#PostageCharge
 * ChargeType13Code.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#RegulatoryFee
 * ChargeType13Code.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#ShippingCharge
 * ChargeType13Code.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#ServiceProvisionFee
 * ChargeType13Code.ServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#ContingencyDeferredSalesCharge
 * ChargeType13Code.ContingencyDeferredSalesCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#CorrespondentBankCharge
 * ChargeType13Code.CorrespondentBankCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType13Code#Premium
 * ChargeType13Code.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType13Code#Initial
 * ChargeType13Code.Initial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#BrokerageFee
 * ChargeType13Code.BrokerageFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#UCITSCommission
 * ChargeType13Code.UCITSCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code#SpeciallyAgreedFrontEndLoad
 * ChargeType13Code.SpeciallyAgreedFrontEndLoad}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode ChargeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies charges linked to the type of service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType13Code BackEndLoad = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType13Code FrontEndLoad = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final ChargeType13Code Switch = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DilutionLevy"</li>
	 * </ul>
	 */
	public static final ChargeType13Code DilutionLevy = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DilutionLevy";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.DilutionLevy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final ChargeType13Code Discount = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * </ul>
	 */
	public static final ChargeType13Code Penalty = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Penalty";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.Penalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * </ul>
	 */
	public static final ChargeType13Code PostageCharge = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.PostageCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * </ul>
	 */
	public static final ChargeType13Code RegulatoryFee = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.RegulatoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * </ul>
	 */
	public static final ChargeType13Code ShippingCharge = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.ShippingCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * </ul>
	 */
	public static final ChargeType13Code ServiceProvisionFee = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.ServiceProvisionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingencyDeferredSalesCharge"</li>
	 * </ul>
	 */
	public static final ChargeType13Code ContingencyDeferredSalesCharge = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingencyDeferredSalesCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.ContingencyDeferredSalesCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharge"</li>
	 * </ul>
	 */
	public static final ChargeType13Code CorrespondentBankCharge = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.CorrespondentBankCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final ChargeType13Code Premium = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * </ul>
	 */
	public static final ChargeType13Code Initial = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.Initial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageFee"</li>
	 * </ul>
	 */
	public static final ChargeType13Code BrokerageFee = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.BrokerageFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UCITSCommission"</li>
	 * </ul>
	 */
	public static final ChargeType13Code UCITSCommission = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UCITSCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.UCITSCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType13Code
	 * ChargeType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpeciallyAgreedFrontEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType13Code SpeciallyAgreedFrontEndLoad = new ChargeType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpeciallyAgreedFrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType13Code.mmObject();
			codeName = ChargeTypeCode.SpeciallyAgreedFrontEndLoad.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType13Code> codesByName = new LinkedHashMap<>();

	protected ChargeType13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType13Code";
				definition = "Identifies charges linked to the type of service.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType13Code.BackEndLoad, com.tools20022.repository.codeset.ChargeType13Code.FrontEndLoad, com.tools20022.repository.codeset.ChargeType13Code.Switch,
						com.tools20022.repository.codeset.ChargeType13Code.DilutionLevy, com.tools20022.repository.codeset.ChargeType13Code.Discount, com.tools20022.repository.codeset.ChargeType13Code.Penalty,
						com.tools20022.repository.codeset.ChargeType13Code.PostageCharge, com.tools20022.repository.codeset.ChargeType13Code.RegulatoryFee, com.tools20022.repository.codeset.ChargeType13Code.ShippingCharge,
						com.tools20022.repository.codeset.ChargeType13Code.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeType13Code.ContingencyDeferredSalesCharge,
						com.tools20022.repository.codeset.ChargeType13Code.CorrespondentBankCharge, com.tools20022.repository.codeset.ChargeType13Code.Premium, com.tools20022.repository.codeset.ChargeType13Code.Initial,
						com.tools20022.repository.codeset.ChargeType13Code.BrokerageFee, com.tools20022.repository.codeset.ChargeType13Code.UCITSCommission, com.tools20022.repository.codeset.ChargeType13Code.SpeciallyAgreedFrontEndLoad);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(Switch.getCodeName().get(), Switch);
		codesByName.put(DilutionLevy.getCodeName().get(), DilutionLevy);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Penalty.getCodeName().get(), Penalty);
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(ContingencyDeferredSalesCharge.getCodeName().get(), ContingencyDeferredSalesCharge);
		codesByName.put(CorrespondentBankCharge.getCodeName().get(), CorrespondentBankCharge);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(BrokerageFee.getCodeName().get(), BrokerageFee);
		codesByName.put(UCITSCommission.getCodeName().get(), UCITSCommission);
		codesByName.put(SpeciallyAgreedFrontEndLoad.getCodeName().get(), SpeciallyAgreedFrontEndLoad);
	}

	public static ChargeType13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType13Code[] values() {
		ChargeType13Code[] values = new ChargeType13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType13Code> {
		@Override
		public ChargeType13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}