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
import com.tools20022.repository.codeset.ChargeType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of service for which a charge is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#BackEndLoad
 * ChargeType6Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#FrontEndLoad
 * ChargeType6Code.FrontEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Switch
 * ChargeType6Code.Switch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#DilutionLevy
 * ChargeType6Code.DilutionLevy}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Discount
 * ChargeType6Code.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Penalty
 * ChargeType6Code.Penalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#ManagementFee
 * ChargeType6Code.ManagementFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#PostageCharge
 * ChargeType6Code.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#RegulatoryFee
 * ChargeType6Code.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#ShippingCharge
 * ChargeType6Code.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#ServiceProvisionFee
 * ChargeType6Code.ServiceProvisionFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Other
 * ChargeType6Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#ContingencyDeferredSalesCharge
 * ChargeType6Code.ContingencyDeferredSalesCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#Equalisation
 * ChargeType6Code.Equalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code#CorrespondentBankCharge
 * ChargeType6Code.CorrespondentBankCharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Premium
 * ChargeType6Code.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType6Code#Initial
 * ChargeType6Code.Initial}</li>
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
 * "ChargeType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of service for which a charge is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType6Code BackEndLoad = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType6Code FrontEndLoad = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switch"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Switch = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Switch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DilutionLevy"</li>
	 * </ul>
	 */
	public static final ChargeType6Code DilutionLevy = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DilutionLevy";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.DilutionLevy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Discount = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Penalty"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Penalty = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Penalty";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Penalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementFee"</li>
	 * </ul>
	 */
	public static final ChargeType6Code ManagementFee = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.ManagementFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * </ul>
	 */
	public static final ChargeType6Code PostageCharge = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.PostageCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * </ul>
	 */
	public static final ChargeType6Code RegulatoryFee = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.RegulatoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * </ul>
	 */
	public static final ChargeType6Code ShippingCharge = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.ShippingCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * </ul>
	 */
	public static final ChargeType6Code ServiceProvisionFee = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.ServiceProvisionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Other = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingencyDeferredSalesCharge"</li>
	 * </ul>
	 */
	public static final ChargeType6Code ContingencyDeferredSalesCharge = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingencyDeferredSalesCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.ContingencyDeferredSalesCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Equalisation = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Equalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharge"</li>
	 * </ul>
	 */
	public static final ChargeType6Code CorrespondentBankCharge = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.CorrespondentBankCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Premium = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType6Code
	 * ChargeType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * </ul>
	 */
	public static final ChargeType6Code Initial = new ChargeType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType6Code.mmObject();
			codeName = ChargeTypeCode.Initial.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType6Code> codesByName = new LinkedHashMap<>();

	protected ChargeType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType6Code";
				definition = "Specifies the type of service for which a charge is asked or paid.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType6Code.BackEndLoad, com.tools20022.repository.codeset.ChargeType6Code.FrontEndLoad, com.tools20022.repository.codeset.ChargeType6Code.Switch,
						com.tools20022.repository.codeset.ChargeType6Code.DilutionLevy, com.tools20022.repository.codeset.ChargeType6Code.Discount, com.tools20022.repository.codeset.ChargeType6Code.Penalty,
						com.tools20022.repository.codeset.ChargeType6Code.ManagementFee, com.tools20022.repository.codeset.ChargeType6Code.PostageCharge, com.tools20022.repository.codeset.ChargeType6Code.RegulatoryFee,
						com.tools20022.repository.codeset.ChargeType6Code.ShippingCharge, com.tools20022.repository.codeset.ChargeType6Code.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeType6Code.Other,
						com.tools20022.repository.codeset.ChargeType6Code.ContingencyDeferredSalesCharge, com.tools20022.repository.codeset.ChargeType6Code.Equalisation,
						com.tools20022.repository.codeset.ChargeType6Code.CorrespondentBankCharge, com.tools20022.repository.codeset.ChargeType6Code.Premium, com.tools20022.repository.codeset.ChargeType6Code.Initial);
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
		codesByName.put(ManagementFee.getCodeName().get(), ManagementFee);
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ContingencyDeferredSalesCharge.getCodeName().get(), ContingencyDeferredSalesCharge);
		codesByName.put(Equalisation.getCodeName().get(), Equalisation);
		codesByName.put(CorrespondentBankCharge.getCodeName().get(), CorrespondentBankCharge);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Initial.getCodeName().get(), Initial);
	}

	public static ChargeType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType6Code[] values() {
		ChargeType6Code[] values = new ChargeType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType6Code> {
		@Override
		public ChargeType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}