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
import com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the additional business process linked to a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#ClaimOrCompensation
 * AdditionalBusinessProcess6Code.ClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#NotificationOfReversal
 * AdditionalBusinessProcess6Code.NotificationOfReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#TaxRefund
 * AdditionalBusinessProcess6Code.TaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#PartialMandatoryPutRedemption
 * AdditionalBusinessProcess6Code.PartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#PartialPreFunding
 * AdditionalBusinessProcess6Code.PartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#FullPrefunding
 * AdditionalBusinessProcess6Code.FullPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#RequiredAction
 * AdditionalBusinessProcess6Code.RequiredAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
 * AdditionalBusinessProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLAI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcess6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code
 * AdditionalBusinessProcess2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcess6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#ClaimOrCompensation
	 * AdditionalBusinessProcess2Code.ClaimOrCompensation}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code ClaimOrCompensation = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimOrCompensation";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.ClaimOrCompensation;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.ClaimOrCompensation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationOfReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#NotificationOfReversal
	 * AdditionalBusinessProcess2Code.NotificationOfReversal}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code NotificationOfReversal = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationOfReversal";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.NotificationOfReversal;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.NotificationOfReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#TaxRefund
	 * AdditionalBusinessProcess2Code.TaxRefund}</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code TaxRefund = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefund";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.TaxRefund;
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.TaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code PartialMandatoryPutRedemption = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialMandatoryPutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code PartialPreFunding = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.PartialPreFunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code FullPrefunding = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.FullPrefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAction"</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcess6Code RequiredAction = new AdditionalBusinessProcess6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAction";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.mmObject();
			codeName = AdditionalBusinessProcessCode.RequiredAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcess6Code> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcess6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLAI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess6Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess2Code.mmObject();
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.ClaimOrCompensation, com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.NotificationOfReversal,
						com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.TaxRefund, com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.PartialMandatoryPutRedemption,
						com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.PartialPreFunding, com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.FullPrefunding,
						com.tools20022.repository.codeset.AdditionalBusinessProcess6Code.RequiredAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClaimOrCompensation.getCodeName().get(), ClaimOrCompensation);
		codesByName.put(NotificationOfReversal.getCodeName().get(), NotificationOfReversal);
		codesByName.put(TaxRefund.getCodeName().get(), TaxRefund);
		codesByName.put(PartialMandatoryPutRedemption.getCodeName().get(), PartialMandatoryPutRedemption);
		codesByName.put(PartialPreFunding.getCodeName().get(), PartialPreFunding);
		codesByName.put(FullPrefunding.getCodeName().get(), FullPrefunding);
		codesByName.put(RequiredAction.getCodeName().get(), RequiredAction);
	}

	public static AdditionalBusinessProcess6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcess6Code[] values() {
		AdditionalBusinessProcess6Code[] values = new AdditionalBusinessProcess6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcess6Code> {
		@Override
		public AdditionalBusinessProcess6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcess6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}